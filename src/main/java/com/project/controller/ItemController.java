package com.project.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.modal.Items;
import com.project.service.ItemService;

@RestController
public class ItemController 
{
	@Autowired
	ItemService itemService;
	
	@PostMapping("/add/item")
	public Items addItem(@RequestBody  @Valid Items itemRequest )
	{
		return itemService.addItem(itemRequest);
	}
	
	@GetMapping("/get/item/{id}")
	public Items getItemsId(Integer id)
	{
		 Items items = itemService.getItemsById(id);
		 if(items == null)
		 {
			 throw new RuntimeException("Item not found");
		 }
		 return items;
	}
	
	
}
