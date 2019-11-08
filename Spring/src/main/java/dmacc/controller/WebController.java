package dmacc.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Theater;
import dmacc.repository.TheaterRepository;

@Controller
public class WebController {
	@Autowired
	TheaterRepository repo;

	@GetMapping("/viewAll")
	public String viewAlltheater(Model model) {
		model.addAttribute("theater", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputtheater")
	public String addNewtheater(Model model) {
		Theater c = new Theater();
		model.addAttribute("newtheater", c);
		return "input";
	}
	
	@PostMapping("/inputtheater")
	public String addNewtheater(@ModelAttribute Theater c, Model model) {
		repo.save(c);
		model.addAttribute("newtheater", repo.findAll());
		return "results";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
	    Theater c = repo.findById((long) id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    model.addAttribute("theater", c);
	    return "update";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, @Valid Theater c, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        c.setId(id);
	        return "update";
	    }
	         
	    repo.save(c);
	    model.addAttribute("theater", repo.findAll());
		return "results";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id, Model model) {
	    Theater c = repo.findById((long) id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    repo.delete(c);
	    model.addAttribute("theater", repo.findAll());
		return "results";
	}
}
