DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test;
USE test;

drop table if exists author;
drop table if exists piece ;

create table author (
  ID int (10) AUTO_INCREMENT,
  FIRST_NAME varchar(20) NOT NULL,
  LAST_NAME varchar(20) NOT NULL,
  COUNTRY varchar(20) NOT NULL,
  BIRTH_DATE DATE,
  PRIMARY KEY (ID)
);

create table piece (
  ID int (10) AUTO_INCREMENT,
  NAME varchar(20) NOT NULL,
  CREATE_DATE DATE,
  COVER BLOB,
  TEXT LONGTEXT,
  ID_AUTHOR int (10),
  PRIMARY KEY (ID),
  FOREIGN KEY (ID_AUTHOR) REFERENCES author (ID)
);