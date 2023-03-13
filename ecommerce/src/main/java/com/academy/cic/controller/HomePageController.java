package com.academy.cic.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.academy.cic.model.Products;
import com.academy.cic.service.ProductService;

@Controller
@RequestMapping (value = "/")
public class HomePageController {
	
	@Resource(name="productServiceDefault")
	ProductService productservice;
	
	@GetMapping
	public String unspecified(Model model) {
		
		List<Products> prodotti = productservice.getProductsOrderedByCode(0, 10);
		model.addAttribute("products", prodotti);
		return "homepage";
	}

}
