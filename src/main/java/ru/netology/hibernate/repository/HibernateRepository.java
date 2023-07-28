package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.model.Persons;

import java.util.List;

@Repository
@Transactional
public class HibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List getPersonsByCity(String city){
        Query query = entityManager.createQuery("select p from Persons p  where p.city_of_living = :city", Persons.class);
        query.setParameter("city", city);
        //List<Persons> result = query.getResultList();
        return query.getResultList();
    }
}