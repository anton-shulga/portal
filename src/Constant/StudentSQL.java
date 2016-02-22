package Constant;

/**
 * Created by Антон on 18.02.2016.
 */
public class StudentSQL {
    public static final String INSERT = "insert into student (ID,Login, Name, Surname, PhoneNumber, Email, BanStatus) VALUES (?,?,?,?,?,?,?)";
    public static final String UPDATE = "UPDATE student set Login=?, Name=?, Surname=?, PhoneNumber=?, Email=?, BanStatus=? WHERE ID=?";
    public static final String DELETE = "DELETE FROM student WHERE ID=?";
    public static final String GET_ALL = "SELECT ID, Login, Name,  Surname, PhoneNumber, Email, BanStatus FROM student";
    public static final String GET_BY_ID = "select * from student where id=?";

}
