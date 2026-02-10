package com.project.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
	public Items getItemsId(@PathVariable Integer id) {
	    Items items = itemService.getItemsById(id);
	    if (items == null) {
	        throw new ResponseStatusException(
	            HttpStatus.NOT_FOUND, "Item not found with id " + id
	        );
	    }
	    return items;
	}

	
	
}
