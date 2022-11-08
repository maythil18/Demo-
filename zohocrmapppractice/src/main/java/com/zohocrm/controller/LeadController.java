package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Lead;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@RequestMapping("/viewLeadPage")
public String viewLeadPage() {
		return"create_lead";
}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		
return"lead_info";
	}
	@RequestMapping("/composeEamil")
	public String composeEmail(@RequestParam("email")String email,ModelMap model ){
model.addAttribute("email",email);
		return"compose_email";
	}







}