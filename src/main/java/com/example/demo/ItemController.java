package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ItemController {
	
	
	@GetMapping("/listar")
	public Item listar(){
		Item item = new Item(1, "ejemplo");
		return item;
	}
	

}
