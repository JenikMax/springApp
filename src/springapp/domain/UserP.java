package springapp.domain;


import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;

public class UserP {
    private int id;
    private String name;
    private String createDate;
    private MultipartFile cover;
    private String text;
    private String idAuthor;

    public UserP(){
    }

    public UserP(String idAuthor, String name, String createDate, MultipartFile cover, String text) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.createDate = createDate;
        this.cover = cover;
        this.text = text;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public MultipartFile  getCover() {
        return cover;
    }

    public void setCover(MultipartFile  cover) {
        this.cover = cover;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", cover='" + cover + '\'' +
                ", text='" + text + '\'' +
                ", idAuthor='" + idAuthor + '\'' +
                '}';
    }
}
