package springapp.domain;


import java.io.FileInputStream;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

public class Piece implements Serializable{
    private int id;
    private String name;
    private Date createDate;
    private byte[] cover;
    private Clob text;
    private Author idAuthor;

    public Piece(){
    }

    public Piece(Author idAuthor, String name, Date createDate, byte[] cover, Clob text) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.createDate = createDate;
        this.cover = cover;
        this.text = text;
    }

    public Author getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Author idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

//    public Blob getCover() {
//        return cover;
//    }
//
//    public void setCover(Blob cover) {
//        this.cover = cover;
//    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public Clob getText() {
        return text;
    }

    public void setText(Clob text) {
        this.text = text;
    }


    public String toString() {
        return "Piece{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", cover=" + cover +
                ", text=" + text +
                ", idAuthor=" + idAuthor +
                '}';
    }
}
