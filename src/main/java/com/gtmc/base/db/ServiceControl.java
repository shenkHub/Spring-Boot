package com.gtmc.base.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.NamingException;

import com.gtmc.common.db.ControlBase;
import com.gtmc.common.db.DBControl;
import com.gtmc.common.macrodef.GtmcConst.ResourceFile;
import com.gtmc.util.PropertyUtil;
import com.gtmc.util.StringUtil;

public class ServiceControl {

    /** DB连接 */
    protected DBControl dbControl = null;

    /** ＤＢ连接池 */
    protected List<DBControl> dbControlList = new ArrayList<DBControl>();

    /**
     * 构造函数
     */
    public ServiceControl() {

    }

    /**
     * 取得DB连接
     * 
     * @return DB连接
     * @throws NamingException 异常
     * @throws SQLException 异常
     */
    public DBControl getConnection() throws NamingException, SQLException {
//
//        dbControl = new DBControl();
//
//        // log level设定
//        String logLevel = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.LOG_LEVEL);
//        // timeout设定
//        String timeout = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.SQL_TIMEOUT);
//        dbControl.setLogging(ControlBase.toLogLevel(logLevel), StringUtil.string2int(timeout));
//        dbControl.lookup(PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.JNDI_NAME));
//        this.dbControlList.add(dbControl);
//        return dbControl;
        dbControl = new DBControl();

        // log level设定
        String logLevel = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.LOG_LEVEL);
        // timeout设定
        String timeout = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.SQL_TIMEOUT);
        dbControl.setLogging(ControlBase.toLogLevel(logLevel), StringUtil.string2int(timeout));
        String url = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.URL);
        String userName = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.USER_NAME);
        String password = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.PASSWORD);
        dbControl.lookup(url, userName, password);
        this.dbControlList.add(dbControl);
        return dbControl;
    }

    /**
     * 取得DB连接
     * 
     * @param jndiName JNDI名
     * @return DB连接
     * @throws NamingException 异常
     * @throws SQLException 异常
     */
    public DBControl getConnection(String jndiName) throws NamingException, SQLException {

        dbControl = new DBControl();

        // log level设定
        String logLevel = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.LOG_LEVEL);
        // timeout设定
        String timeout = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.SQL_TIMEOUT);
        dbControl.setLogging(ControlBase.toLogLevel(logLevel), StringUtil.string2int(timeout));
        dbControl.lookup(jndiName);
        this.dbControlList.add(dbControl);
        return dbControl;
    }

    /**
     * SQL检索
     * 
     * @param sqlID sql
     * @param params 參數
     * @return 結果
     * @throws SQLException 異常
     */
    public List<HashMap<Object, Object>> find(String sqlID, Object... params) throws SQLException {

        return this.dbControl.find(getSQL(sqlID), null, params);
    }

    /**
     * SQL更新
     * 
     * @param sqlID sql
     * @param params 參數
     * @return 結果
     * @throws SQLException 異常
     */
    public int update(String sqlID, Object... params) throws SQLException {

        return this.dbControl.update(getSQL(sqlID), params);
    }

    /**
     * SQL 检索
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws SQLException 異常
     */
    public List<HashMap<Object, Object>> findDirect(String sql, Object... params) throws SQLException {

        return this.dbControl.find(sql, null, params);
    }

    /**
     * SQL更新
     * 
     * @param sql sql
     * @param params 參數
     * @return 結果
     * @throws SQLException 異常
     */
    public int updateDirect(String sql, Object... params) throws SQLException {

        return this.dbControl.update(sql, params);
    }

    /**
     * 根据key值从资源文件中取得SQL文
     * 
     * @param sqlID sql
     * @param params 參數
     * @return 結果
     */
    public String getSQL(String sqlID, Object... params) {

        String sql = PropertyUtil.getValueByKey(ResourceFile.PRO_SQL_NM, sqlID);

        if (null == params || params.length == 0) {
            return sql;
        } else {
            return String.format(sql, params);
        }
    }

    /**
     * 关闭事务
     * @throws SQLException 異常
     */
    public void close() throws SQLException {

        SQLException sqlException = null;
        for (DBControl dbControl : this.dbControlList) {
            try {
                dbControl.close();
            } catch (SQLException e) {
                if (sqlException == null) {
                    sqlException = e;
                }
            }
        }
        this.dbControlList.clear();
        this.dbControl = null;
        if (sqlException != null) {
            throw sqlException;
        }
    }

    /**
     * 事务提交
     * @throws SQLException 異常
     */
    public void commit() throws SQLException {

        SQLException sqlException = null;
        for (DBControl dbControl : this.dbControlList) {
            try {
                dbControl.commit();
            } catch (SQLException e) {
                if (sqlException == null) {
                    sqlException = e;
                }
            }
        }
        if (sqlException != null) {
            throw sqlException;
        }
    }

    /**
     * 事务回滚
     * @throws SQLException 異常
     */
    public void rollback() throws SQLException {

        SQLException sqlException = null;
        for (DBControl dbControl : this.dbControlList) {
            try {
                dbControl.rollback();
            } catch (SQLException e) {
                if (sqlException == null) {
                    sqlException = e;
                }
            }
        }
        if (sqlException != null) {
            throw sqlException;
        }
    }
}
