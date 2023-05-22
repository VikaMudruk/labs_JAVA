package main.java.Lab5.controller;

import main.java.Lab5.model.DBStudent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

    public List<DBStudent> makeDBRequest(String query){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_schema",
                    "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List<DBStudent> list = parseToDBStudent(resultSet);
            resultSet.close();
            statement.close();
            connection.close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR");
            return null;
        }
    }

    private List<DBStudent> parseToDBStudent(ResultSet resultSet){
        List<DBStudent> list = new ArrayList<DBStudent>();
        try {
            while (resultSet.next()){
                list.add(new DBStudent(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDate(5),
                        resultSet.getInt(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
