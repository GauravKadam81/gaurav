package com.example.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductDomain.product;

@Repository
public interface productrepository extends JpaRepository<product ,Integer> {
	product findlyFruitAndcategory(String fruit, String category);


}
