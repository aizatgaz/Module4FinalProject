package com.aizatgaz.dao;

import com.aizatgaz.domain.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * класс для работы с таблицей Country
 */
public class CountryDAO {

    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Country> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Country> fromCountry = session.createQuery("select c from Country c join fetch c.languages", Country.class);
            return fromCountry.list();
        }
    }
}
