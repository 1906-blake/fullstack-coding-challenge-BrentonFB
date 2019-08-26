package com.groceries.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groceries.models.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

	@Query("FROM Item i INNER JOIN Lists l ON (i.listId = l.listId) "
	+ "WHERE l.listId = :id")
	public List<Item> findByListId(int id);

}
