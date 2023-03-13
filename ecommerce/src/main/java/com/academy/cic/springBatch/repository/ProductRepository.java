package com.academy.cic.springBatch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.academy.cic.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{
	
	@Query("SELECT P FROM Products P WHERE P.productline = :lineCode")
	List<Products> searchByProductLine(String lineCode);

}

