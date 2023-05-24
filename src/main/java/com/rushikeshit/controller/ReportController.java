package com.rushikeshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rushikeshit.entity.CitizensPlan;
import com.rushikeshit.request.SearchRequest;
import com.rushikeshit.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	ReportService reportService;
	
	@PostMapping("/search")
	public String requestHandler(@ModelAttribute("search") SearchRequest request , Model model) {
 		System.out.println(request);
		
		List<CitizensPlan> plans = reportService.search(request);
		
		model.addAttribute("plans", plans);
		init(model);
		return "index";
	}
	
	
	@GetMapping("/")
	public String search(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", reportService.getPlanName());
		model.addAttribute("status", reportService.getPlanStatus());
	}
}
