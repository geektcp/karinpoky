package com.geektcp.karinpoky;

import com.geektcp.karinpoky.client.entry.Client;
import com.geektcp.karinpoky.client.entry.KarinpokyClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "example";
    private static final String PASSWORD = "example";

    public static void main(String[] args) throws Exception {
        String sql = "SELECT user_name, age FROM user";

        Client client = KarinpokyClient.build();
        String user = "Yanni";
        boolean isAuthorized = client.checkPermission(user, sql);
        if(!isAuthorized){
            throw new RuntimeException("the user have no permission");
        }
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("user_name")+" age："+  rs.getInt("age"));
        }
    }
}
