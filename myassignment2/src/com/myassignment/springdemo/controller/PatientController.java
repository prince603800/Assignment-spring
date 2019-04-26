package com.myassignment.springdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myassignment.springdemo.entity.Patient;
import com.myassignment.springdemo.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("patient",new Patient());
		return "patient-form";
	}
	
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("patient") Patient thePatient, BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "patient-form";
		}
		else {
			return "forward";
		}
	}
	
	@RequestMapping("/savePatient")
	public String savePatient(@ModelAttribute("patient")Patient thePatient) {
		patientService.savePatient(thePatient);
		return "redirect:/patient/list";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("patientId")int theId,Model theModel) {
		Patient thePatient = patientService.getPatients(theId);
		theModel.addAttribute("patient",thePatient);
		return "patient-form";
	}
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("patientId")int theId) {
		patientService.deleteCustomer(theId);
		return "redirect:/patient/list";
	}
	
	
	
	
	

	
		}
	

