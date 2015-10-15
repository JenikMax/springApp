package springapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import springapp.domain.Author;
import springapp.domain.UserP;
import springapp.service.CatalogService;
import springapp.service.CatalogServiceImpl;
//import springapp.hibernate.HibernateDAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class AddPieceValidator implements Validator{

    public CatalogService catalogService;


    @Override
    public boolean supports(Class clazz) {
        //just validate the FileUpload instances
        return UserP.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UserP file = (UserP)target;

        if(file.getCover().getSize()==0){
            errors.rejectValue("cover", "required.fileUpload","Please select a file!");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "registration.name.empty", "Please enter Name!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "createDate", "registration.createDate.empty", "Please enter Create Date!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idAuthor", "registration.idAuthor.empty", "Please enter Author ID!");

        if (isValidDate(file.getCreateDate())==false){
            errors.rejectValue("createDate", "required.dateFormat","Incorrect date format!!!  Must be dd.MM.yyyy.");
        }
        //HibernateDAO hib = new HibernateDAO();
        int n = 0, id = 0;
        List<Author> author = catalogService.getAuthorList();
        for(int i = 0 ; i<author.size() ; i++) {
            if (Integer.valueOf(file.getIdAuthor()) == author.get(i).getId()){
                n++;
            }
        }
        if(n==0) errors.rejectValue("idAuthor", "required.correctId","Incorrect ID , Author not found!!!!  Please enter true ID!");


    }

    public SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    boolean isValidDate(String input) {
        try {
            format.parse(input);
            return true;
        }
        catch(ParseException e){
            return false;
        }
    }


    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public CatalogService getCatalogService() {
        return catalogService;
    }
}