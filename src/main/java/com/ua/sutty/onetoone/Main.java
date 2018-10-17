package com.ua.sutty.onetoone;

import com.ua.sutty.onetoone.domain.Passport;
import com.ua.sutty.onetoone.domain.Person;
import com.ua.sutty.onetoone.repository.PassportDAO;
import com.ua.sutty.onetoone.repository.PassportDAOMySQLImpl;
import com.ua.sutty.onetoone.repository.PersonDAO;
import com.ua.sutty.onetoone.repository.PersonDAOMySQLImpl;

public class Main {

    public static void main(String[] args) {


        PersonDAO personDAO = new PersonDAOMySQLImpl();
        PassportDAO passportDAO = new PassportDAOMySQLImpl();
//        Passport passport1 = Passport.builder()
//                .number("123213213")
//                .series("HY")
//                .build();
//        Passport passport2 = Passport.builder()
//                .number("543435435")
//                .series("OI")
//                .build();
//        Passport passport3 = Passport.builder()
//                .number("86785465")
//                .series("PK")
//                .build();
        Passport passport1 = passportDAO.getPassword(1);
        Passport passport2 = passportDAO.getPassword(2);
        Passport passport3 = passportDAO.getPassword(3);
//        passportDAO.addPassport(passport1);
//        passportDAO.addPassport(passport2);
//        passportDAO.addPassport(passport3);
        Person person1 = Person.builder()
                .name("fdgfdgfd")
                .passport(passport1)
                .build();
        Person person2 = Person.builder()
                .name("gfdvfd")
                .passport(passport2)
                .build();
        Person person3 = Person.builder()
                .name("Idfgfd")
                .passport(passport3)
                .build();
        personDAO.addPerson(person1);
        personDAO.addPerson(person2);
        personDAO.addPerson(person3);
    }

}
