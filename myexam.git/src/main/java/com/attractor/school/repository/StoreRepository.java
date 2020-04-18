package com.attractor.school.repository;

import com.attractor.school.model.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {
    public List<Store> findByName(String name);
    public List<Store> findByStoreAndProduct(int storeId, int productId);
}
