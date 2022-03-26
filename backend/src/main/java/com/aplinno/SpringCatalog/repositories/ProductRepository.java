package com.aplinno.SpringCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplinno.SpringCatalog.entities.Product;
import com.aplinno.SpringCatalog.entities.category;

@Repository
public interface  ProductRepository extends JpaRepository<Product, Long>{
   
}
