package test1;

public class User {
    private String name;
    private String password;
    private String idNumber;
    private String idPhone;

    public User() {
    }

    public User(String name, String password, String idNumber, String idPhone) {
        this.name = name;
        this.password = password;
        this.idNumber = idNumber;
        this.idPhone = idPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(String idPhone) {
        this.idPhone = idPhone;
    }
}
