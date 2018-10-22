package com.brickiln.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.brickiln.entity.*;

@Repository
public class EmployeeDao {
	
		//Dependency of the Dao
		@Autowired
		HibernateTemplate template;
		
		
		//Method to save Employee object.
		public void save(Employee emp) 
		{
			template.save(emp);
		}
		
		//Method to update Employee object.
		public void update(Employee emp) 
		{
			template.merge(emp);
		}
		
		//Method to remove City object.
	    public void remove(int id) 
		{
		   Employee emp=(Employee)template.get(Employee.class, id);
		   template.delete(emp);
		
		} 
		   
		//Method to load all the cities
	    public List<Employee> allEmployee() 
		{
	    	System.out.println("hi...");
	    	return template.find("from Employee as emp");
	    	
		}
	    
	    //Method to search a User using mailId and password
		public List<Employee> find(int id) 
		{
			System.out.println(id);
			return (List<Employee>)template.find("from Employee as emp");		
		}
}
		   
		   
	