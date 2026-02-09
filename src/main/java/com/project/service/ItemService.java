package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.modal.Items;

@Service
public class ItemService 
{
	List<Items> list = new ArrayList<>();
	
	Integer cnt = 1; 
	public Items addItem(Items item)
	{
		item.setId(cnt++);
		list.add(item);
		return item;
	}

	public Items getItemsById(Integer id)//2
	{
		for(Items item :list)
		{
			if(item.getId().equals(id))
			{
				return item;
			}
		}
		return null;
	}
}
