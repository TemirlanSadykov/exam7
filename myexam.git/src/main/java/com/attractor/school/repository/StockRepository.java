package com.attractor.school.repository;

import com.attractor.school.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {
    public List<Stock> findAllByName(String name);
}
