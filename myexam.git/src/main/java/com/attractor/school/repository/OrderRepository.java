package com.attractor.school.repository;

import com.attractor.school.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    public List<Order> findByCustomerAndProduct(int CustomerId, int ProductId);
}
