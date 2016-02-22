package DAO;

import Constant.LecturerSQL;
import Model.Lecturer;
import Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 19.02.2016.
 */
public class LecturerDAO {
    private Connection connection;

    public LecturerDAO() {
        this.connection = DBUtil.getConnection();
    }

    public void addLectuerer(Lecturer lecturer){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LecturerSQL.INSERT);
            preparedStatement.setInt(1, lecturer.getId());
            preparedStatement.setString(2, lecturer.getLogin());
            preparedStatement.setString(3, lecturer.getName());
            preparedStatement.setString(4, lecturer.getSurname());
            preparedStatement.setString(5, lecturer.getPhoneNumber());
            preparedStatement.setString(6, lecturer.getEmail());
            preparedStatement.setByte(7, lecturer.getBanStatus());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLecturer(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LecturerSQL.DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Lecturer> getAllLecturers(){
        List<Lecturer> listOfLecturers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LecturerSQL.GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                listOfLecturers.add(new Lecturer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getByte(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfLecturers;
    }

    public Lecturer getLecturerById(int id){
        Lecturer lecturer = new Lecturer();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(LecturerSQL.GET_BY_ID);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lecturer;
    }
}
