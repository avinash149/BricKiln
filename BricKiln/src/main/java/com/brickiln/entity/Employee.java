package com.brickiln.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="AccountMaster")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String empType;
	
	@NotEmpty(message="Name is mandatory.")
	@Pattern(regexp="[a-z,A-Z]{2}[a-z,A-Z, ]*",	message="Name can contain only alphabets, min length 2.")
	private String name;
	
	@NotEmpty(message="Father name is mandatory.")
	@Pattern(regexp="[a-z,A-Z]{2}[a-z,A-Z, ]*",	message="Name can contain only alphabets, min length 2.")
	private String fname;
	
	@NotEmpty(message="Adhar is mandatory.")
	@Length(min=12,max=12, message="Adhar must have 12 chars.")
	private String adhar;
	
	@NotEmpty(message="Mobile is mandatory.")
	@Length(min=10,max=10, message="Mobile no. must have 10 chars.")
	private String mobile;
	
	private String address;
	
	private String advance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdvance() {
		return advance;
	}

	public void setAdvance(String advance) {
		this.advance = advance;
	}	
	
}
