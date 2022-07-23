package com.library;

import java.sql.*;

public class ConnectionService extends DriveManager {

    ConnectionService() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("You are connected with MySql Database:");
            Statement statement = connection.createStatement();
            String sql = "select * from names";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next())
                System.out.println(resultSet.getString("email"));

        } catch (SQLException e) {
            e.printStackTrace();


        }

    }


}