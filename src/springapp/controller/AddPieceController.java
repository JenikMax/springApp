package springapp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import springapp.domain.Author;
import springapp.domain.Piece;
import springapp.domain.UserP;
import springapp.service.BClobConvert;
import springapp.service.CatalogService;
import springapp.service.DateHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Clob;

//import springapp.hibernate.HibernateDAO;


public class AddPieceController extends SimpleFormController {

    private CatalogService catalogService;

    protected final Log logger = LogFactory.getLog(getClass());
    //private CatalogServiceImpl catalogService;

    public AddPieceController() {
        setCommandClass(UserP.class);
        setCommandName("piece");

    }




    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response,
                                    Object command, BindException errors) throws Exception {

//        CatalogServiceImpl catalog = new CatalogServiceImpl();

        UserP p = (UserP)command;
        Author author = new Author();

        logger.info(p.toString());
        //HibernateDAO hib = new HibernateDAO();
        int id = Integer.valueOf(p.getIdAuthor());
        logger.info("author id is - " + id);
        author = catalogService.getAuthor(id);

        logger.info(p.toString());
        Piece piece = new Piece();

        piece.setName(p.getName());

//----------------------------------------------------

        MultipartFile multipartFile = p.getCover();
        byte[] cover =multipartFile.getBytes();
//        File convFile = new File(multipartFile.getOriginalFilename());
//        convFile.createNewFile();
//        FileOutputStream fos = new FileOutputStream(convFile);
//        fos.write(multipartFile.getBytes());
//        fos.close();


//        Blob blob = new BClobConvert().newBlob(convFile);
        piece.setCover(cover);

//----------------------------------------------------
        Clob clob = new BClobConvert().newClob(p.getText());

        piece.setText(clob);

        DateHelper d = new DateHelper();
        piece.setCreateDate(d.parseDate(p.getCreateDate()));

        piece.setIdAuthor(author);
        //author.getPiece().add(piece);

        logger.info(piece.toString());
        catalogService.savePiece(piece);
        String message = "Operation Complete!!!";
        return new ModelAndView("Success","message",message);

    }

    public CatalogService getCatalogService() {
        return catalogService;
    }

    public void setCatalog(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }


}