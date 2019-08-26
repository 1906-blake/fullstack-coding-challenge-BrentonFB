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

	public Lists save(Lists lists) {
		lists.setListId(0);
		return listRepo.saveAndFlush(lists);
	}

	public Lists deleteById(int id) {
		if(listRepo.getOne(id) != null) {			
			Lists checkerList = listRepo.getOne(id);
			if(checkerList.getListId() == id) {			
				listRepo.deleteById(id);
			}
		}
		return null;
	}

}
