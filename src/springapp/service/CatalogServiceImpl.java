package springapp.service;

import springapp.dao.AuthorDao;
import springapp.dao.PieceDao;
import springapp.dao.impl.AuthorDaoImpl;
import springapp.dao.impl.PieceDaoImpl;
import springapp.domain.Author;
import springapp.domain.Piece;
//import springapp.hibernate.HibernateDAO;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CatalogServiceImpl implements CatalogService {


    private AuthorDaoImpl authorDao;
    private PieceDaoImpl pieceDao;

    public CatalogServiceImpl() {
    }



    public List<Author> getAuthorList(){
        return authorDao.listAuthor();
    }

    public void saveAuthor(Author author){
        authorDao.save(author);
    }

    public void updateAuthor(Author author){
        authorDao.update(author);
    }

    public void deleteAuthor(Author author){
        authorDao.delete(author);
    }

    public Author getAuthor(int id){
        return authorDao.getAuthor(id);
    }



    public List<Piece> getPieceList(){
        return pieceDao.listPiece();
    }

    public void savePiece(Piece piece){
        pieceDao.save(piece);
    }

    public void updatePiece(Piece piece){
        pieceDao.update(piece);
    }

    public void deletePiece(Piece piece){
        pieceDao.delete(piece);
    }

    public Piece getPiece(int id){
        return pieceDao.getPiece(id);
    }






    public void setAuthorDao(AuthorDaoImpl authorDao) {
        this.authorDao = authorDao;
    }

    public AuthorDaoImpl getAuthorDao() {
        return authorDao;
    }

    public void setPieceDao(PieceDaoImpl pieceDao) {
        this.pieceDao = pieceDao;
    }

    public PieceDaoImpl getPieceDao() {
        return pieceDao;
    }

    /*public List getPieceList(Author author){
        HibernateDAO hib = new HibernateDAO();
        List result=null;
        Piece piece = new Piece();
        List<Piece> piecL;
        ArrayList<Piece> arr;
        piecL = hib.listPiece();
        for(int count = 0 ;count< piecL.size() ; count++){
            piece = piecL.get(count);
            if(author.equals(piecL.get(count).getIdAuthor())) {
                result.add(piecL.get(count));
            }
        }
        return result;
    }
*/

   /* public List getPieceList() {
        HibernateDAO hib = new HibernateDAO();
        List<Piece> piece = hib.listPiece();


        return piece;
    }
*/
   /* public void saveAuthor(Author author){
        HibernateDAO hib = new HibernateDAO();
        hib.addAuthor(author);
    }

    @Override
    public void savePiece(Piece piece) {
        HibernateDAO hib = new HibernateDAO();

        hib.addPiece(piece);
    }

    public void savePiece(Author idAuthor, String name, Date createDate, String coverPath, String text) throws FileNotFoundException {
        HibernateDAO hib = new HibernateDAO();

        hib.addPiece(idAuthor, name, createDate, coverPath, text);
    }

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public void setAuthorDao(AuthorDaoImpl authorDao) {
        this.authorDao = authorDao;
    }

    public PieceDao getPieceDao() {
        return pieceDao;
    }

    public void setPieceDao(PieceDao pieceDao) {
        this.pieceDao = pieceDao;
    }


*/

}
