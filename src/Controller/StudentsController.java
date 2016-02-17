package Controller;

import DAO.StudentsDAO;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Антон on 12.02.2016.
 */
@javax.servlet.annotation.WebServlet(name = "Controller.StudentsController", urlPatterns = "/students")
public class StudentsController extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/student.jsp";
    private static String LIST_USER = "/studentsList.jsp";
    private StudentsDAO dao;

    public StudentsController(){
        dao = new StudentsDAO();

    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            request.setAttribute("students", dao.getListOfStudents());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("WEB-INF/students.jsp").forward(request, response);
    }
}
