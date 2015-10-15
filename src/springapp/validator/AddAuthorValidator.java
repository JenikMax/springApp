package springapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import springapp.domain.User;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AddAuthorValidator implements Validator {
    public boolean supports(Class aClass) {
        return aClass.equals(User.class);
    }

    public void validate(Object o, Errors errors) {
        User author = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "registration.firstName.empty", "First name should have more than 0 letters");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "registration.lastName.empty", "Last name should have more than 0 letters");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "registration.country.empty", "Country should have more than 0 letters");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthDate", "registration.birthDate.empty", "Please enter Birth Date");
        String s = "dd.MM.yyyy";

        if (isValidDate(author.getBirthDate())==false){
            errors.rejectValue("birthDate", "required.dateFormat","Incorrect date format!!!  Must be dd.MM.yyyy.");
        }




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
    public boolean dateValid(String dateToValidate, String dateFromat){

        if(dateToValidate == null){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
            //System.out.println(date);

        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }


}