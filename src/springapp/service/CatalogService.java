package springapp.service;


import springapp.domain.Author;
import springapp.domain.Piece;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public interface CatalogService {
    public List<Author> getAuthorList();
    public List<Piece> getPieceList();
    public void saveAuthor(Author author);
    public void updateAuthor(Author author);
    public void deleteAuthor(Author author);
    public Author getAuthor(int id);

    public void savePiece(Piece piece);
    public void updatePiece(Piece piece);
    public void deletePiece(Piece piece);
    public Piece getPiece(int id);

   // public void savePiece(Piece piece);
   // public void savePiece(Author idAuthor, String name, Date createDate, String coverPath, String text) throws FileNotFoundException;


}
