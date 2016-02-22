package Constant;

/**
 * Created by Антон on 19.02.2016.
 */
public class LecturerSQL {
    public static final String INSERT = "insert into lecturer (ID, Login, Name, Surname, PhoneNumber, Email, BanStatus) VALUES (?,?,?,?,?,?,?)";
    public static final String UPDATE = "UPDATE lecturer set Login=?, Name=?, Surname=?, PhoneNumber=?, Email=?, BanStatus=? WHERE ID=?";
    public static final String DELETE = "DELETE FROM lecturer WHERE ID=?";
    public static final String GET_ALL = "SELECT ID, Login, Name,  Surname, PhoneNumber, Email, BanStatus FROM lecturer";
    public static final String GET_BY_ID = "select * from lecturer where id=?";
}
