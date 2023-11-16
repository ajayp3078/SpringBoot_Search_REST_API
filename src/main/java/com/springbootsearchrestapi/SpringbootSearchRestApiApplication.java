package com.springbootsearchrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSearchRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSearchRestApiApplication.class, args);
	}

}

//Postman entry in JSON format
//
//{
//		"sku": "ABC",
//		"name":"keyboard 123",
//		"description":"keyboard 123 description",
//		"active": true,
//		"imageUrl": "keyboard123.jpg"
//}
