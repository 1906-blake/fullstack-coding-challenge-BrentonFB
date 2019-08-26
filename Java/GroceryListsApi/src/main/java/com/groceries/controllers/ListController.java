package com.groceries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return listService.findAll();
	}
	
	@PostMapping
	public Lists addList(@RequestBody Lists lists) {
		return listService.save(lists);
	}
	
	@DeleteMapping("/{id}")
	public Lists deleteById(@PathVariable int id) {
		return listService.deleteById(id);
	}
}
