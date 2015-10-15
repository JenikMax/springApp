package springapp.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import springapp.dao.AuthorDao;
import springapp.domain.Author;
import org.hibernate.Session;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO сделать настройких всех необходимых бинов дл€ HibernateDaoSupport
//TODO сконфигурировать спринг-бин дл€ dataSource
public class AuthorDaoImpl extends HibernateDaoSupport implements AuthorDao {



    public AuthorDaoImpl() {

    }

    @Override

    public List<Author> listAuthor() {
        //TODO после того как все будет сконфигурировано расскомменитровать и попробовать выполнить
       // return this.getHibernateTemplate().find("from author");

        List<Author> authors = this.getHibernateTemplate().loadAll(Author.class);

        return authors;

    }

    public void save(Author author){
        getHibernateTemplate().save(author);
    }

    public void update(Author author){
        getHibernateTemplate().update(author);
    }

    public void delete(Author author){
        getHibernateTemplate().delete(author);
    }

    public Author getAuthor(int idAuthor){
        Author author = (Author) getHibernateTemplate().get(Author.class,idAuthor); //.find("from author where id=?",idAuthor);
        return author;
    }

    //TODO прописать dataSource в applicationContext.xml дл€ бина нашегей ƒјќшки


}
