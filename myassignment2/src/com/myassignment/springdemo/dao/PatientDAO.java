package com.myassignment.springdemo.dao;

import java.util.List;

import com.myassignment.springdemo.entity.Patient;

public interface PatientDAO {
	public void savePatient(Patient thePatient);
	
	public List<Patient> getPatients();
	
	public Patient getPatient(int theId);
	
	public void deleteCustomer(int theId);
}
