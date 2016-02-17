package Entity;

import java.util.Date;

/**
 * Created by Антон on 17.02.2016.
 */
public class Document {
    private int id;
    private String studentsName;
    private String stringSurname;
    private String type;
    private Course course;
    private Lecturer lecturer;
    private Date date;

    public Document(int id, String studentsName, String stringSurname, String type, Course course, Lecturer lecturer, Date date) {
        this.id = id;
        this.studentsName = studentsName;
        this.stringSurname = stringSurname;
        this.type = type;
        this.course = course;
        this.lecturer = lecturer;
        this.date = date;
    }

    public int getId() {

        return id;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public String getStringSurname() {
        return stringSurname;
    }

    public String getType() {
        return type;
    }

    public Course getCourse() {
        return course;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Date getDate() {
        return date;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public void setStringSurname(String stringSurname) {
        this.stringSurname = stringSurname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
