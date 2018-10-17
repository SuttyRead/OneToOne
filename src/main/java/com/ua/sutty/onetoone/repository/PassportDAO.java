package com.ua.sutty.onetoone.repository;

import com.ua.sutty.onetoone.domain.Passport;

import java.util.List;

public interface PassportDAO {

    void addPassport(Passport passport);

    void removePassport(long id);

    void updatePassport(Passport passport);

    Passport getPassword(long id);

    List<Passport> getAllPassports();

}
