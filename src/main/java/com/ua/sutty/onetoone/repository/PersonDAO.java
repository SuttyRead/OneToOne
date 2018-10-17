package com.ua.sutty.onetoone.repository;

import com.ua.sutty.onetoone.domain.Person;

import java.util.List;

public interface PersonDAO {

    void addPerson(Person person);

    void removePerson(long id);

    void updatePerson(Person person);

    Person getPerson(long id);

    List<Person> getAllPersons();


}
