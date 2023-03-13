package com.academy.cic.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.academy.cic.service.ProductService;
import com.academy.cic.model.Products;
import com.academy.cic.springBatch.repository.ProductRepository;
import io.micrometer.core.instrument.util.StringUtils;

@Component
public class ProductServiceDefault implements ProductService {
	@Autowired
	private ProductRepository userRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Products> getProductByLine(String lineCode)
	{
		List<Products> products = new ArrayList<>();
		if(StringUtils.isNotEmpty(lineCode)) {
			products = userRepository.searchByProductLine(lineCode);
		}
		return products;
	}
	@Override
	public List<Products> getProductsOrderedByCode(int offset, int limit) {
		//Spring JPA non gestisce all'interno dell'annotation @Query lo statement "limit",
		//per questo l'implementazione come per il metodo "getProductByLine" non è percorribile.
		//Un'alternativa può essere quella di delegare all'entityManager la query,l'offset e il limite (vedi riga 45)
		//Oppure ad esempio esistono classi di utility che astraggono il concetto di paginazione, così da non
		//dover reinventare una soluzione ad-hoc ogni volta che si presenta questa problematica.
	    TypedQuery<Products> query = entityManager.createQuery("SELECT P FROM Products P ORDER BY P.productcode", Products.class);
	    query.setFirstResult(offset).setMaxResults(limit);
	    return query.getResultList();
	}
	
}
