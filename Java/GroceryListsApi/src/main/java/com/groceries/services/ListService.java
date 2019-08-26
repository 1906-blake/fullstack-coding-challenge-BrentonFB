package com.groceries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceries.models.Lists;
import com.groceries.repos.ListRepo;

@Service
public class ListService {
	
	@Autowired
	private ListRepo listRepo;

	public List<Lists> findAll() {
		return listRepo.findAll();
	}

}
