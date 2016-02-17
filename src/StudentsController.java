import DAO.DAO;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Антон on 12.02.2016.
 */
@javax.servlet.annotation.WebServlet(name = "StudentsController", urlPatterns = "/students")
public class StudentsController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            request.setAttribute("students", DAO.getListOfStudents());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("WEB-INF/students.jsp").forward(request, response);
    }
}
