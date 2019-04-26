package com.myassignment.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.myassignment.springdemo.entity.Patient;

public class PatientDAOImpl implements PatientDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void savePatient(Patient thePatient) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(thePatient);
	}


	@Override
	public List<Patient> getPatients() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Patient> theQuery = currentSession.createQuery("from Patient order by name ",Patient.class);
		List<Patient> patients = theQuery.getResultList();
		return patients;
	}


	@Override
	public Patient getPatient(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Patient thePatient = currentSession.get(Patient.class, theId);
		return thePatient;
	}


	@Override
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Patient where id=:patientId");
		theQuery.executeUpdate();
		
	}

}
