package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.GroceryStore;

@Repository
public interface GroceriesRepository extends JpaRepository<GroceryStore, Integer>{

}
