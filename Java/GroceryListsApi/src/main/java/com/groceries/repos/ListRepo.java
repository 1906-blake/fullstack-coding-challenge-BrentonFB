package com.groceries.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groceries.models.Item;
import com.groceries.models.Lists;

public interface ListRepo extends JpaRepository<Lists, Integer> {

	public List<Lists> findAll();
	

//	public Lists findById(int id);

	public Lists save(Lists lists);

}
