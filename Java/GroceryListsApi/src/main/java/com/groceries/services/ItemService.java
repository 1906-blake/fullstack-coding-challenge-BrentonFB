package com.groceries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceries.models.Item;
import com.groceries.repos.ItemRepo;

@Service
public class ItemService {

	@Autowired
	private ItemRepo itemRepo;
	
	public List<Item> findByListId(int id) {
		return itemRepo.findByListId(id);
	}

}
