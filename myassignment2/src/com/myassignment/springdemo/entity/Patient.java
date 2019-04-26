package com.myassignment.springdemo.entity;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Patient {
	
	@NotNull(message = "is required")
	@Size(min=3, message= "is required")
	private String name;
	
	
	@Size(min=10,message= "should be at least 10 character long")
	private String address;
	
	@Pattern(regexp="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]*[.][a-zA-Z]*",message = "invalid email address")
	private String email;
	
	@Pattern(regexp=" (0|91)?[7-9][0-9]{9}",message = "invalid phone number")
	private String phNumber;
	private  String password;
	
	
	
	
	public Patient() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Patient [name=" + name + ", Address=" + address + ", email=" + email + ", phNumber=" + phNumber
				+ ", password=" + password + "]";
	}
	
	
}
