package Model;

/**
 * Created by Антон on 12.02.2016.
 */
public class Student extends User {

    public Student(int id, String login, String name, String surname, String phoneNumber, String email, byte banStatus) {
        super(id, login, name, surname, email, phoneNumber, banStatus);
    }
    public Student(){}

    }

