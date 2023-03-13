package com.academy.cic.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.cic.service.ProductService;

@Controller
@RequestMapping(value="/search")
public class SearchController {
	
	@Resource(name="productServiceDefault")
	ProductService productservice;

	@GetMapping
	public String search(Model model) {
		
		return "search";
	}
	
	@GetMapping(value="/productline")
	public String searchPl(@RequestParam(name = "productline") String pl, Model model) {
		
		model.addAttribute("products", productservice.getProductByLine(pl));
		
		return "search";
	}
}
