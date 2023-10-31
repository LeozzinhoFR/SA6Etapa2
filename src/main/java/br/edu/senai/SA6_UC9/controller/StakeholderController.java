package br.edu.senai.SA6_UC9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.senai.SA6_UC9.service.StakeholderService;
import br.edu.senai.SA6_UC9.model.Stakeholder;

@Controller
public class StakeholderController {
	
	@Autowired
	private StakeholderService stakeholderService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStakeholder", stakeholderService.getAllStakeholders());
		return "index";
	}
	
	@GetMapping("/addStakeholderForm")
	public String addStakeholderForm(Model model) {
		// Create model attribute to bind form data
		Stakeholder stakeholder = new Stakeholder();
		model.addAttribute("stakeholder", stakeholder);
		return "novo_stakeholder";
	}
	
	@PostMapping("/saveStakeholder")
	public String saveStakeholder(@ModelAttribute("stakeholder") Stakeholder stakeholder) {
		stakeholderService.saveStakeholder(stakeholder);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id") short id, Model model) {
		Stakeholder stakeholder = stakeholderService.getStakeholderById(id);
		model.addAttribute("stakeholder", stakeholder);
		return "atualizar_stakeholder";
	}
	
	@GetMapping("/deleteStakeholder/{id}")
	public String deleteStakeholder(@PathVariable (value = "id") short id) {
		this.stakeholderService.deleteStakeholderById(id);
		return "redirect:/";
	}
	

}
