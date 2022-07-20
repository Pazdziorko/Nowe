package lib;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "pazdziorko1991");

            Statement sta = con.createStatement();
            ResultSet res = sta.executeQuery("select * from names");
            while (res.next());
            System.out.println(res.getString("name"));



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
