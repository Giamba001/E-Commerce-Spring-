package com.academy.cic.service;

import java.util.List;

import com.academy.cic.model.Products;

public interface ProductService {

	List<Products> getProductByLine(String lineCode);

	List<Products> getProductsOrderedByCode(int offset, int limit);

}
