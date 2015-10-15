package springapp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.mvc.Controller;


import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import springapp.domain.Author;
import springapp.domain.Piece;
import springapp.service.CatalogService;


public class CatalogController implements Controller {

    private CatalogService catalogService;
    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        CatalogServiceImpl catalog = new CatalogServiceImpl();
        //HibernateDAO hib = new HibernateDAO();
        //HibernateDAO hib1 = new HibernateDAO();

        List <Author> auth = catalogService.getAuthorList(); //hib.listAuthor();
        List <Piece> piece = catalogService.getPieceList(); //hib1.listPiece();
        logger.info("read data from db COMPLETE!!");


        ModelAndView model = new ModelAndView("catalog");
        String message = "All information Details";
        model.addObject("authors",auth);
        model.addObject("pieces",piece);
        model.addObject("message",message);
        logger.info("Returning author view with " + model);

        return model;
    }

    public CatalogService getCatalogService() {
        return catalogService;
    }

    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }
}