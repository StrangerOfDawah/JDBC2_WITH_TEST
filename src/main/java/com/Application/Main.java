package com.Application;

import com.jdbc.Cities;
import com.jdbc.Connecter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String USERNAME = "root";
    public static String PASSWORD = "root";
    public static String URL = "jdbc:mysql://localhost:3306/world?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException {
        List<Cities> cities = new ArrayList<Cities>();
        Connection conn = null;
        Statement statement = null;

        try {
            conn = new Connecter().getConnection(URL, USERNAME, PASSWORD);
            statement = conn.createStatement();
            String query = "Select * FROM world.city";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String code = resultSet.getString("CountryCode");
                String district = resultSet.getString("District");
                int population = resultSet.getInt("Population");
                cities.add(new Cities(id, name, code, district, population));
            }
        }catch (SQLException e){
            System.out.println("Проверьте ваши запросы на наличие ошибок в названии столбцов");
        }finally {
            if (conn != null) {
                conn.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
        JustChoiceYourCity theCity = new JustChoiceYourCity();
        theCity.guessTheCity(cities);
    }
}
