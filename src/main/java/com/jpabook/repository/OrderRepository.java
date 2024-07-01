package com.jpabook.repository;

import com.jpabook.domain.Order;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public void findOne(Long id) {
        em.find(Order.class, id);
    }

    // public List<Order> findAll(OrderSearch orderSearch)
}
