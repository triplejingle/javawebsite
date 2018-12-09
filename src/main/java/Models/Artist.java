package Models;


import java.util.Date;

public class Artist {

    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        System.out.println(firstname);
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        System.out.println(lastname);
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
