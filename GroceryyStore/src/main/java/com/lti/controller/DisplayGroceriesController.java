package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lti.entity.GroceryStore;
import com.lti.service.DisplayGroceriesService;

@Controller
public class DisplayGroceriesController {

	@Autowired
	private DisplayGroceriesService displayGroceriesService;


	@GetMapping("/getAllGrocery")
	public String viewGroceries(Model model) {
		model.addAttribute("products", displayGroceriesService.viewProduct());
		return "Home";
	}

	@GetMapping("/showAddGroceries")
	public String showGroceriesForm(Model model) {
		GroceryStore grocery=new GroceryStore();
		model.addAttribute("Grocery", grocery);
		System.out.println("hi");
		return "AddGrocery";

	}

	@PostMapping("/saveGrocery")
	public String saveGroceries(@ModelAttribute("grocery") GroceryStore grocery) {
		System.out.println("hello");
		displayGroceriesService.saveGroceries(grocery);
		return "redirect:/getAllGrocery";
	}

	@GetMapping("showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		GroceryStore grocery = displayGroceriesService.GetGroceryById(id);
		model.addAttribute("Grocery", grocery);
		return "UpdateGrocery";
	}

	@GetMapping("/deleteGroceries/{id}")
	public String deleteGrocery(@PathVariable(value = "id") int id) {
		displayGroceriesService.deleteGroceries(id);
		return "redirect:/getAllGrocery";
	}

}
