package com.brickiln.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="UserMaster")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message="Name is mandatory.")
	@Pattern(regexp="[a-z,A-Z]{2}[a-z,A-Z, ]*",	message="Name can contain only alphabets, min length 2.")
	private String name;
	
	@NotEmpty(message="Email is required.")
	@Email(message="Email should be in proper format.")
	private String email;
	
	@NotEmpty(message="Password is required.")
	@Length(min=4,message="Password must have at least 4 chars.")
	private String password;
	
	private String address;
	
	@NotEmpty(message="Mobile is mandatory.")
	@Length(min=10,max=10, message="Mobile no. must have 10 chars.")
	private String mobile;
	
	@NotEmpty(message="Adhar is mandatory.")
	@Length(min=12,max=12, message="Adhar must have 12 chars.")
	private String adhar;
	
	
	public String getAddress() {
		return address;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public String getAdhar() {
		return adhar;
	}
				
}
