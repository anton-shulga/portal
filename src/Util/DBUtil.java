package Util;

import Constant.DBSettings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Антон on 17.02.2016.
 */
public class DBUtil {

    private static Connection connection = null;


    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(DBSettings.DATA_BASE_URL, DBSettings.LOGIN, DBSettings.PASSWORD);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
