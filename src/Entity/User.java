package Entity;

/**
 * Created by Антон on 16.02.2016.
 */
public class User {
    private int id;
    private String surname;
    private String name;
    private String phoneNumber;
    private String login;
    private String email;
    private byte banStatus;


    public User(int id, String login, String name, String surname, String email, String phoneNumber, byte banStatus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.banStatus = banStatus;

    }

    public byte getBanStatus() {
        return banStatus;
    }

    public void setBanStatus(byte banStatus) {

        this.banStatus = banStatus;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
