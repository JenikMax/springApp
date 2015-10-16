package springapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private final static SimpleDateFormat STD_DATE_FORMATTER = new SimpleDateFormat("dd.MM.yyyy");

    private DateHelper(){}

    public static Date parseDate(String value) {
        Date result = null;
        try {
           result = STD_DATE_FORMATTER.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}