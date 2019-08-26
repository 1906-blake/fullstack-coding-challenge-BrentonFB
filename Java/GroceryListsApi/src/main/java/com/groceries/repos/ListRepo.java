package com.groceries.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceries.models.Lists;

public interface ListRepo extends JpaRepository<Lists, Integer> {

	public List<Lists> findAll();

	public Lists save(Lists lists);

}
