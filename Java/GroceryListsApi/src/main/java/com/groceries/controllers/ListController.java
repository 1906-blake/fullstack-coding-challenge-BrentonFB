package com.groceries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceries.models.Lists;
import com.groceries.services.ListService;

@RestController
@RequestMapping("/lists")
public class ListController {

	@Autowired
	private ListService listService;
	
	@GetMapping
	public List<Lists> findAll() {
		System.out.println("should print out");
		return listService.findAll();
	}
}
