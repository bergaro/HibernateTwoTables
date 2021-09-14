package ru.netology.layerdao.repository;

import org.springframework.stereotype.Repository;
import ru.netology.layerdao.entities.Order;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AppRepository {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Order> getProductName(String customerName) {
        Query query = entityManager.createQuery("select o from Orders o " +
                " where o.customer in (select c.id from Customers c where c.name = :name)");
        query.setParameter("name", customerName);
        return query.getResultList();
    }
}
