package com.ua.sutty.onetoone.repository;

import com.ua.sutty.onetoone.domain.Passport;
import com.ua.sutty.onetoone.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class PassportDAOMySQLImpl implements PassportDAO {


    @Override
    public void addPassport(Passport passport) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(passport);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removePassport(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Passport passport = session.get(Passport.class, id);
        session.remove(passport);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updatePassport(Passport passport) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(passport);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Passport getPassword(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Passport passport = session.get(Passport.class, id);
        session.getTransaction().commit();
        session.close();
        return passport;
    }

    @SuppressWarnings(value = "unchecked")
    @Override
    public List<Passport> getAllPassports() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Passport> passports = session.createQuery("From Passport ").list();
        session.getTransaction().commit();
        session.close();
        return passports;
    }
}
