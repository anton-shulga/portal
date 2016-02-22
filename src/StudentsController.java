import DAO.StudentsDAO;
import Model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Антон on 17.02.2016.
 */

public class StudentsController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "WEB-INF/View/Student.jsp";
    private static String LIST_STUDENT = "WEB-INF/View/studentsList.jsp";
    private StudentsDAO dao;

    public StudentsController() {
        super();
        dao = new StudentsDAO();

    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Student student = new Student();
        student.setLogin(request.getParameter("login"));
        student.setName(request.getParameter("name"));
        student.setSurname(request.getParameter("surname"));
        student.setPhoneNumber(request.getParameter("phoneNumber"));
        student.setEmail(request.getParameter("email"));
        String id = request.getParameter("id");
        if (id == null || id.isEmpty()) {
            dao.addStudent(student);
        } else {
            student.setId(Integer.parseInt(id));
            dao.updateStudent(student);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_STUDENT);
        try {
            request.setAttribute("students", dao.getListOfStudents());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        view.forward(request, response);
    }



    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteStudent(id);
            forward = LIST_STUDENT;
            try {
                request.setAttribute("students", dao.getListOfStudents());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int id = Integer.parseInt(request.getParameter("id"));
            Student student = dao.getStudentById(id);
            request.setAttribute("student", student);
        } else if (action.equalsIgnoreCase("studentsList")){
            forward = LIST_STUDENT;
            try {
                request.setAttribute("students", dao.getListOfStudents());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else
            forward = INSERT_OR_EDIT;


        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
}
