import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String surname;
    private String mail;
    private Integer phone;

    public Contact () {
    }

    public Contact(String name, String surname, String mail, Integer phone) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
