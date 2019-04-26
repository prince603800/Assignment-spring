package com.myassignment.springdemo.service;

import java.util.List;

import com.myassignment.springdemo.entity.Patient;

public interface PatientService {
	public void savePatient(Patient thePatient);
	
	public List<Patient> getPatient();
	
	public Patient getPatients(int theId);
	
	public void deleteCustomer(int theId);
}
