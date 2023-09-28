package com.aizatgaz.dao;

import com.aizatgaz.domain.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * класс для работы с таблицей City
 */
public class CityDAO {

    private final SessionFactory sessionFactory;


    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<City> getItems(int offset, int limit) {
        try (Session session = sessionFactory.openSession()) {
            Query<City> fromCity = session.createQuery("from City", City.class);
            fromCity.setFirstResult(offset);
            fromCity.setMaxResults(limit);
            return fromCity.list();
        }
    }

    public int getTotalCount() {
        try (Session session = sessionFactory.openSession()) {
            Query<City> fromCity = session.createQuery("from City", City.class);
            return fromCity.list().size();
        }
    }

    public City getById(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(City.class, id);
        }
    }
}
