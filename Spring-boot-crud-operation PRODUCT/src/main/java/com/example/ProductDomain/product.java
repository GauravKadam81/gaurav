package com.example.ProductDomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="login")

public class product {
	@Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;
    private String Fruit;
    private String category;
public product()
{
} 
public product(int id, String Fruit, String category) {
this.id= id;
this.Fruit= Fruit;
this.category= category;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFruit() {
	return Fruit;
}
public void setFruit(String Fruit) {
	this.Fruit = Fruit;
}
public String getcategory() {
	return category;
}
public void setcategory(String category) {
	this.category = category;
}

}
