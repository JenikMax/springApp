package springapp.dao;
import springapp.domain.Piece;

import java.util.List;

public interface PieceDao {

    List<Piece> listPiece();
    void save(Piece piece);
    void update(Piece piece);
    void delete(Piece piece);
    Piece getPiece(int idPiece);
}