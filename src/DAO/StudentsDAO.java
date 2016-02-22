package DAO;


import Constant.StudentSQL;
import Model.Student;
import Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 12.02.2016.
 */
public class StudentsDAO {

    private Connection connection;

    public StudentsDAO(){
        connection = DBUtil.getConnection();
    }


    public void addStudent(Student student){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(StudentSQL.INSERT);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getLogin());
            preparedStatement.setString(3, student.getName());
            preparedStatement.setString(4, student.getSurname());
            preparedStatement.setString(5, student.getPhoneNumber());
            preparedStatement.setString(6, student.getEmail());
            preparedStatement.setByte(7, student.getBanStatus());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(StudentSQL.DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student){

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(StudentSQL.UPDATE);
            preparedStatement.setString(1, student.getLogin());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getSurname());
            preparedStatement.setString(4, student.getPhoneNumber());
            preparedStatement.setString(5, student.getEmail());
            preparedStatement.setByte(6, student.getBanStatus());
            preparedStatement.setInt(7, student.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  List<Student> getListOfStudents() throws SQLException, ClassNotFoundException {

        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(StudentSQL.GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listOfStudents.add(new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getByte(7)));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return listOfStudents;
    }


    public Student getStudentById(int id) {
        Student student = new Student();

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(StudentSQL.GET_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setLogin(resultSet.getString("login"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setPhoneNumber(resultSet.getString("phoneNumber"));
                student.setEmail(resultSet.getString("email"));
                student.setBanStatus(resultSet.getByte("banStatus"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

}
