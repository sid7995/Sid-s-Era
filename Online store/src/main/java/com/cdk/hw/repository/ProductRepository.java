package com.cdk.hw.repository;

import com.cdk.hw.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findByTypeAndName(String type,String name);

}
