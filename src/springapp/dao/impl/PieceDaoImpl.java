package springapp.dao.impl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import springapp.dao.PieceDao;
import springapp.domain.Author;
import springapp.domain.Piece;

import org.hibernate.Hibernate;
import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

/**
 * Created by JenikMax on 01.10.2015.
 */
public class PieceDaoImpl extends HibernateDaoSupport implements PieceDao {



    public PieceDaoImpl() {

    }


    @Override

    public List<Piece> listPiece() {


        Session session = getSession();
        //Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Piece> result = session.createCriteria(Piece.class).list();
        Author author;
        Piece piec;
        for (Piece p : result) {
            Hibernate.initialize(p.getIdAuthor());
        }
        session.getTransaction().commit();
        return result;
    }



    public void save(Piece piece){
        getHibernateTemplate().save(piece);
    }

    public void update(Piece piece){
        getHibernateTemplate().update(piece);
    }

    public void delete(Piece piece){
        getHibernateTemplate().delete(piece);
    }

    public Piece getPiece(int idPiece){
        Piece piece = (Piece)getHibernateTemplate().get(Piece.class,idPiece);
        return piece;
    }




}

