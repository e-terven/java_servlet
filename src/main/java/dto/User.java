package dto;

public class User {
    private String fname;
    private String lname;
    private String email;
    private int age;
    private long contact;
    private String city;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                ", city='" + city + '\'' +
                '}';
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public long getContact() {
        return contact;
    }

    public String getCity() {
        return city;
    }
}
