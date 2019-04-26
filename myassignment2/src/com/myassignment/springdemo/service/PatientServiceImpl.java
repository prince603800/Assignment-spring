package com.myassignment.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.myassignment.springdemo.dao.PatientDAO;
import com.myassignment.springdemo.entity.Patient;

public class PatientServiceImpl implements PatientService{
	@Autowired PatientDAO patientDao;
	
	
	
	@Override
	public void savePatient(Patient thePatient) {
		patientDao.savePatient(thePatient);
	}



	@Override
	@Transactional
	public List<Patient> getPatient() {
		
		return patientDao.getPatients();
	}



	@Override
	@Transactional
	public Patient getPatients(int theId) {
		return patientDao.getPatient(theId);
	}



	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		patientDao.deleteCustomer(theId);
		
	}
	
}
