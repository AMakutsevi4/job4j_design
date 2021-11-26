package ru.job4j.jdbc;

import ru.job4j.io.Config;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Config cfg = new Config("./src/sqlResurces/app.properties");
        cfg.load();
        String url = cfg.value("url");
        String login = cfg.value("username");
        String password = cfg.value("password");
        try (Connection connection = DriverManager.getConnection(url, login, password)) {
            Class.forName("org.postgresql.Driver");
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getUserName());
            System.out.println(metaData.getURL());
        }
    }
}
