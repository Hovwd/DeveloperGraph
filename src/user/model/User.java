package user.model;
import user.model.Type.Gender;
import java.util.Date;
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private Date birdtDate;
    private Gender gender;
    private String country;
    private String sity;
    private String mail;
    private String password;
    private String image;
    private String logo;
    public User(long id, String firstName, String lastName, Date birdtDate, Gender gender, String country, String sity, String mail, String password, String image, String logo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birdtDate = birdtDate;
        this.gender = gender;
        this.country = country;
        this.sity = sity;
        this.mail = mail;
        this.password = password;
        this.image = image;
        this.logo = logo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirdtDate(Date birdtDate) {
        this.birdtDate = birdtDate;
    }

    public Date getBirdtDate() {
        return birdtDate;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getSity() {
        return sity;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }
}
