package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.GroceryStore;
import com.lti.repository.GroceriesRepository;

@Service
public class DisplayGroceriesService {

	@Autowired
	private GroceriesRepository repo;

	public List<GroceryStore> viewProduct() {
		return repo.findAll();
	}

	public void saveGroceries(GroceryStore g) {
		repo.save(g);
	}

	public GroceryStore GetGroceryById(int i) {
		Optional<GroceryStore> optional = repo.findById(i);
		GroceryStore grocery = optional.get();
		return grocery;
	}

	public void deleteGroceries(int i) {
		Optional<GroceryStore> optional = repo.findById(i);
		GroceryStore grocery = optional.get();
		repo.delete(grocery);
	}

}
