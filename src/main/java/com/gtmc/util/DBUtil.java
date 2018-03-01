package com.gtmc.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * DBUtil.java
 * 
 * @author common
 *
 */
public class DBUtil {
    /**
     * 结果设定
     * 
     * @param preparedStatement preparedStatement
     * @param typeList 类型List
     * @param params 参数
     * @throws SQLException 異常
     */
    public static void setParam(PreparedStatement preparedStatement, int[] typeList, Object[] params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            if (params[i] == null) {
                if (typeList != null) {
                    preparedStatement.setNull(i + 1, typeList[i]);
                } else {
                    preparedStatement.setNull(i + 1, 1);
                }
            } else {
                preparedStatement.setObject(i + 1, params[i]);
            }
        }
    }

    /**
     * 结果设定
     * 
     * @param resultSet 查询结果
     * @param resultSetMetaData 查询结果
     * @return 数据键值对List
     * @throws SQLException Object
     */
    public static List<HashMap<Object, Object>> makeResultList(ResultSet resultSet, ResultSetMetaData resultSetMetaData) throws SQLException {
        List<HashMap<Object, Object>> resultList = new ArrayList<HashMap<Object, Object>>();

        while (resultSet.next()) {
            resultList.add(makeResultData(resultSet, resultSetMetaData));
        }
        return resultList;
    }

    /**
     * 结果设定
     * 
     * @param resultSet 查询结果
     * @param resultSetMetaData 查询结果
     * @return 数据键值对
     * @throws SQLException 异常
     */
    public static HashMap<Object, Object> makeResultData(ResultSet resultSet, ResultSetMetaData resultSetMetaData) throws SQLException {
        HashMap<Object, Object> resultData = new HashMap<Object, Object>();

        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            resultData.put(resultSetMetaData.getColumnName(i), resultSet.getObject(i));
        }
        return resultData;
    }
}