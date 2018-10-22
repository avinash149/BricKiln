package com.brickiln.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="RateMaster")
public class Carrier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message="Name is mandatory.")
	@Pattern(regexp="[a-z,A-Z]{2}[a-z,A-Z, ]*",	message="Name can contain only alphabets, min length 2.")
	private String name;
			
	@NotEmpty(message="Quantity is mandatory.")
	private String quantity;
	
	@NotEmpty(message="Price is mandatory.")
	private String price;
		
	final private String unit = "NOS";

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

	
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}
	
	
}
