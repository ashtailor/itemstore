package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.modal.Items;

@Service
public class ItemService 
{
	static List<Items> list = new ArrayList<>();
	static Integer cnt = 1; 
	
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
			if(id.equals(item.getId()))
			{
				return item;
			}
		}
		return null;
	}
}
