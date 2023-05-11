package com.example.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductService.productservice;
import com.example.ProductRepository.productrepository;

@Service
public class productservice {
	@Autowired
	private productrepository repo;

	   public com.example.ProductDomain.product product(String Fruit, String category) {
		   com.example.ProductDomain.product user= repo.findlyFruitAndcategory(Fruit, category);
		    return user;


}
}