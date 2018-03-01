package com.gtmc.common.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gtmc.util.DBUtil;

/**********************************************************
 * DBControl.java
 * 
 * @author common
 * @version 1.0.0
 *
 **********************************************************/
public class DBControl extends ControlBase {

	/** 日志对象 */
	private static Logger logger = LoggerFactory.getLogger(DBControl.class);

	/** 日志对象 */
	private static Logger sqlLogger = LoggerFactory.getLogger("sqlperformance");

	String jndiName = "";
	int jndiIsolation = 2;

	Connection connection = null;

	DataSource dataSource = null;

	public String lastSQL = null;

	public Object[] lastParams = null;

	boolean inExecution = false;

	public int open(String className, String dbUrl, String user, String password)
			throws ClassNotFoundException, SQLException {
		if (this.connection != null) {
			return 2;
		}

		Class.forName(className);

		if (this.connection == null) {
			this.connection = DriverManager
					.getConnection(dbUrl, user, password);
			this.connection.setAutoCommit(false);
		}
		this.inExecution = false;
		return 0;
	}

	public int lookup(String jndiName) throws NamingException, SQLException {
		return lookup(jndiName, 2);
	}

	public int lookupDataSource(String jndiName) throws NamingException {
		this.jndiName = jndiName;
		InitialContext ic = new InitialContext();
		this.dataSource = ((DataSource) ic.lookup(jndiName));
		return 0;
	}

	public int connect() throws SQLException {
		return connect(2);
	}

	public int connect(int jndiIsolation) throws SQLException {
		if (this.connection != null) {
			return 2;
		}
		this.jndiIsolation = jndiIsolation;
		this.connection = this.dataSource.getConnection();
		if (jndiIsolation >= 0) {
			this.connection.setTransactionIsolation(jndiIsolation);
		}
		this.connection.setAutoCommit(false);
		if (super.isLogLevelDebug()) {
			logger.info(String.format("DB连接成功。CON=%s",
					new Object[] { this.connection }));
		}
		return 0;
	}
	public int connect(String url, String userName, String password, int jndiIsolation) throws SQLException {
        if (this.connection != null) {
            return 2;
        }
        this.jndiIsolation = jndiIsolation;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.error(e.getMessage());
        } // 加载Oracle驱动程序
        this.connection = DriverManager.getConnection(url, userName, password);// 获取连接
        // this.connection = this.dataSource.getConnection();
        if (jndiIsolation >= 0) {
            this.connection.setTransactionIsolation(jndiIsolation);
        }
        this.connection.setAutoCommit(false);
        if (super.isLogLevelDebug()) {
            logger.info(String.format("DB连接成功。CON=%s", new Object[] { this.connection }));
        }
        return 0;
    }
	public int lookup(String jndiName, int jndiIsolation)
			throws NamingException, SQLException {
		lookupDataSource(jndiName);
		return connect(jndiIsolation);
	}
	  public int lookup(String url, String userName, String password) throws NamingException, SQLException {
	        return connect(url, userName, password, 2);
	    }
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void commit() throws SQLException {
		if (super.isLogLevelInfo()) {
			logger.info(String.format("成功提交。CON=%s",
					new Object[] { this.connection }));
		}
		if ((this.connection != null) && (this.inExecution)) {
			this.connection.commit();
			this.inExecution = false;
		}
	}

	public void rollback() throws SQLException {
		if (super.isLogLevelInfo()) {
			logger.info(String.format("成功回滚。CON=%s",
					new Object[] { this.connection }));
		}
		if ((this.connection != null) && (this.inExecution)) {
			this.connection.rollback();
			this.inExecution = false;
		}
	}

	public void close() throws SQLException {
		if (super.isLogLevelDebug()) {
			logger.info(String.format("连接关闭成功。CON=%s",
					new Object[] { this.connection }));
		}
		if (this.connection != null) {
			this.connection.close();
			this.connection = null;
		}
		this.inExecution = false;
	}

	public List<HashMap<Object, Object>> find(String sql, Object[] params)
			throws SQLException {
		return find(sql, null, params);
	}

	private void setLast(String sql, Object[] params) {
		this.lastSQL = sql;
		this.lastParams = params;
	}

	public List<HashMap<Object, Object>> find(String sql, int[] typeList,
			Object[] params) throws SQLException {
		DBResultControl resultControl = new DBResultControl();

		setLast(sql, params);
		List<HashMap<Object, Object>> resultList;
		try {
			TimeOutMng timeOutMng = TimeOutMng.set(this.alertTimeOut);

			executeQuery(sql, resultControl, typeList, params);

			if (timeOutMng.isTimeOut()) {
				sqlLogger.info(String.format(
						"SQL执行超时。执行时间：%d秒,SQL:%s,PARM:%s",
						new Object[] { timeOutMng.diff(), sql,
								Arrays.asList(params) }));
			}

			resultList = DBUtil.makeResultList(resultControl.resultSet,
					resultControl.resultSetMetaData);

			if (super.isLogLevelDetail()) {

				logger.info(String.format(
						"SQL=%s,PARAM=%s,RESULT=%d件",
						new Object[] { sql, Arrays.asList(params),
								Integer.valueOf(resultList.size()) }));
			}
		} catch (SQLException e) {
			try {
				logger.info(String.format("SQL=%s,PARAM=%s", new Object[] {
						sql, Arrays.asList(params) }));
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			throw e;
		} finally {
			resultControl.close();
		}

		this.inExecution = true;
		return resultList;
	}

	public void findForFetch(String sql, DBResultControl resultControl,
			Object[] params) throws SQLException {
		findForFetch(sql, null, resultControl, params);
	}

	public void findForFetch(String sql, int[] typeList,
			DBResultControl resultControl, Object[] params) throws SQLException {
		setLast(sql, params);

		if (super.isLogLevelDetail()) {
			logger.info(String.format("SQL=%s,PARAM=%s", new Object[] { sql,
					Arrays.asList(params) }));
		}

		try {
			TimeOutMng timeOutMng = TimeOutMng.set(this.alertTimeOut);

			executeQuery(sql, resultControl, typeList, params);

			if (timeOutMng.isTimeOut()) {
				sqlLogger.info(String.format("SQL执行超时。执行时间：%d秒,SQL:%s,PARM:%s",
						new Object[] { Integer.valueOf(this.alertTimeOut), sql,
								Arrays.asList(params) }));
			}
		} catch (SQLException e) {
			resultControl.close();
			throw e;
		}

		this.inExecution = true;
	}

	public int update(String sql, Object[] params) throws SQLException {
		return update(sql, null, params);
	}

	public int update(String sql, int[] typeList, Object[] params)
			throws SQLException {
		DBResultControl resultControl = new DBResultControl();

		setLast(sql, params);

		if (super.isLogLevelInfo()) {
			logger.info(String.format("SQL=%s,PARAM=%s", new Object[] { sql,
					Arrays.asList(params) }));

		}
		int ret;
		try {
			TimeOutMng timeOutMng = TimeOutMng.set(this.alertTimeOut);

			ret = executeUpdate(sql, resultControl, typeList, params);

			if (timeOutMng.isTimeOut()) {
				sqlLogger.info(String.format(
						"SQL执行超时。执行时间：%d秒,SQL:%s,PARM:%s，更新记录数=%d",
						new Object[] { timeOutMng.diff(), sql,
								Arrays.asList(params), Integer.valueOf(ret) }));
			}
			if (super.isLogLevelInfo()) {
				logger.info(String.format(
						"SQL=%s,PARAM=%s,RESULT=%d件",
						new Object[] { sql, Arrays.asList(params),
								Integer.valueOf(ret) }));
			}
		} catch (SQLException e) {
			try {
				logger.info(String.format("SQL=%s,PARAM=%s", new Object[] {
						sql, Arrays.asList(params) }));
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			throw e;
		} finally {
			resultControl.close();
		}

		this.inExecution = true;
		return ret;
	}

	private int executeUpdate(String sql, DBResultControl resultControl,
			int[] typeList, Object[] params) throws SQLException {
		int ret;
		if ((params == null) || (params.length == 0)) {
			resultControl.statement = this.connection.createStatement();
			ret = resultControl.statement.executeUpdate(sql);
		} else {
			resultControl.preparedStatement = this.connection
					.prepareStatement(sql);

			if (super.isLogLevelDebug()) {
				ParameterMetaData metaData = resultControl.preparedStatement
						.getParameterMetaData();
				for (int i = 1; i <= metaData.getParameterCount(); i++) {
					logger.info(String
							.format("PARAM(%d) typeName=%s,type=%d,mode=%d,precision=%d,scale=%d",
									new Object[] {
											Integer.valueOf(i),
											metaData.getParameterTypeName(i),
											Integer.valueOf(metaData
													.getParameterType(i)),
											Integer.valueOf(metaData
													.getParameterMode(i)),
											Integer.valueOf(metaData
													.getPrecision(i)),
											Integer.valueOf(metaData
													.getScale(i)) }));
				}
			}
			DBUtil.setParam(resultControl.preparedStatement, typeList, params);
			ret = resultControl.preparedStatement.executeUpdate();
		}
		return ret;
	}

	private void executeQuery(String sql, DBResultControl resultControl,
			int[] typeList, Object[] params) throws SQLException {
		if ((params == null) || (params.length == 0)) {
			resultControl.statement = this.connection.createStatement();
			resultControl.resultSet = resultControl.statement.executeQuery(sql);
		} else {
			resultControl.preparedStatement = this.connection
					.prepareStatement(sql);
			DBUtil.setParam(resultControl.preparedStatement, typeList, params);
			resultControl.resultSet = resultControl.preparedStatement
					.executeQuery();
		}
		resultControl.resultSetMetaData = resultControl.resultSet.getMetaData();
	}

	public String getJndiName() {
		return this.jndiName;
	}

	public int getJndiIsolation() {
		return this.jndiIsolation;
	}

	/** add by liang_xiao 20170508 返回control中的Connection Start */
	// 返回control中的Connection
	public Connection getConnection() {
		return this.connection;
	}
	/** add by liang_xiao 20170508 返回control中的Connection End */
}
