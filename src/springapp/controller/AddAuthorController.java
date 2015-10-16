package springapp.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import springapp.domain.Author;
import springapp.domain.User;
import springapp.service.CatalogService;
import springapp.service.DateHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
Контроллер добавления авторов
 */
public class AddAuthorController extends SimpleFormController {

    public CatalogService catalogService;
    protected final Log logger = LogFactory.getLog(getClass());



    public AddAuthorController() {
        setCommandClass(User.class);
        setCommandName("author");
    }




    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response,
                                    Object command, BindException errors) throws Exception {


        //logger.info(command.toString());
//        DateHelper d = new DateHelper();
        User a = (User)command;
        Author author = new Author(a.getFirstName(),a.getLastName(),a.getCountry(),DateHelper.parseDate(a.getBirthDate()));

        logger.info(author.toString());
        catalogService.saveAuthor(author);
        
        String message = "Operation Complete!!!";
        return new ModelAndView("Success","message",message);

    }

    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public CatalogService getCatalogService() {
        return catalogService;
    }
}