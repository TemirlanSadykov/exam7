package com.attractor.school.repository;


import com.attractor.school.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<String, Integer> {
    public List<Product> findAllByName(String name);
    public List<Product> findByName(String name);
}