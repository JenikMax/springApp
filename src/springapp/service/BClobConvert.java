package springapp.service;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.sql.rowset.serial.SerialClob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

/**
 * Created by JenikMax on 03.10.2015.
 */
public class BClobConvert {

    public BClobConvert(){

    }

    public Blob newBlob(File file) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);
        Blob blob = Hibernate.createBlob(inputStream, (int) file.length());// .getLobCreator(session).createBlob(inputStream, file.length());
        return blob;
    }

    public Clob newClob(String file) throws FileNotFoundException, SQLException {
        Clob clob = new SerialClob(file.toCharArray());
        return clob;
    }

}
