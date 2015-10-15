package springapp.dao;

import springapp.domain.Author;

import java.util.List;

/**
 * Created by Василий on 30.09.2015.
 */
public interface AuthorDao {

    List<Author> listAuthor();
    void save(Author author);
    void update(Author author);
    void delete(Author author);
    Author getAuthor(int idAuthor);
}
