package Model;

/**
 * Created by Антон on 16.02.2016.
 */
public class Lecturer extends User {

    public Lecturer(int id, String login, String name, String surname, String email, String phoneNumber, byte banStatus) {
        super(id, login, name, surname, email, phoneNumber, banStatus);
    }

    public Lecturer(){}
}
