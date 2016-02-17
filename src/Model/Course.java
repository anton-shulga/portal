package Model;

/**
 * Created by Антон on 17.02.2016.
 */
public class Course {
    private int id;
    private String name;
    private String technology;
    private Lecturer lecturer;
    private int price;

    public Course(int id, String name, String technology, Lecturer lecturer, int price) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.lecturer = lecturer;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public int getPrice() {
        return price;
    }
}
