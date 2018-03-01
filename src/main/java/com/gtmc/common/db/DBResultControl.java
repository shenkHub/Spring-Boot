package com.gtmc.common.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBResultControl {

    public Statement statement;

    public PreparedStatement preparedStatement;

    public ResultSet resultSet;

    public ResultSetMetaData resultSetMetaData;

    public DBResultControl() {
        statement = null;
        preparedStatement = null;
        resultSet = null;
        resultSetMetaData = null;
    }

    public void close() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
            resultSet = null;
        }
        if (statement != null) {
            statement.close();
            statement = null;
        }
        if (preparedStatement != null) {
            preparedStatement.close();
            preparedStatement = null;
        }
    }

}
