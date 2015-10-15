package springapp.service;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DateHelper {

    private final static SimpleDateFormat STD_DATE_FORMATTER = new SimpleDateFormat("dd.MM.yyyy");

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