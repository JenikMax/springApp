package springapp.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Author implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private Date birthDate;

    private Set piece = new HashSet();

    public Author() {
        //piece = new HashSet<Piece>(0);

    }

    public Author(String firstName, String lastName, String country, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.birthDate = birthDate;
        //piece = new HashSet<Piece>(0);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Piece> getPiece() {
        return piece;
    }

    public void setPiece(Set<Piece> piece) {
        this.piece = piece;
    }


    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", birthDate=" + birthDate +
              //  ", piece=" + piece +
                '}';
    }
}

