package ru.tpu.recgen.dao;

import ru.tpu.recgen.sql.ConnectionPool;

import java.sql.Connection;
import java.util.ResourceBundle;

public class JdbcDaoFactory extends DaoFactory {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("h2Database");
    private static String driverName = resourceBundle.getString("db.driver");
    private static String url = resourceBundle.getString("db.url");
    private static String user = resourceBundle.getString("db.user");
    private static String password = resourceBundle.getString("db.password");
    private static Integer maxConnection = Integer.valueOf(resourceBundle.getString("db.maxconnection"));
    private static ConnectionPool connectionPool = ConnectionPool.getInstance(driverName, url, user, password, maxConnection);

    public static Connection createConnection() {
        return connectionPool.getConnection();
    }

    public static void freeConnection(Connection connection) {
        connectionPool.freeConnection(connection);
    }

    @Override
    public AuthorDao getAuthorDao() {
        return new JdbcAuthorDao();
    }

    @Override
    public TitleDao getTitleDao() {
        return new JdbcTitleDao();
    }
}
