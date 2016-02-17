package DAO;


import Constant.DBSettings;
import Entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 12.02.2016.
 */
public class StudentsDAO {
    private List<Student> listOfStudents = new ArrayList<Student>();


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(DBSettings.DATA_BASE_URL, DBSettings.LOGIN, DBSettings.PASSWORD);
    }

    public static List<Student> getListOfStudents() throws SQLException, ClassNotFoundException {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID, Login, Name,  Surname, PhoneNumber, Email, BanStatus FROM student");
             ResultSet resultSet = preparedStatement.executeQuery()) {


            while (resultSet.next()) {
                listOfStudents.add(new Student(resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getString(3),
                        resultSet.getString(4),resultSet.getString(5), resultSet.getString(6), resultSet.getByte(7)));
            }

            return listOfStudents;
        }
    }
}
