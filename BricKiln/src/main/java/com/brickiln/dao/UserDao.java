package com.brickiln.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.brickiln.entity.User;

@Repository
public class UserDao {
	
	//Dependency of the Dao
	@Autowired
	HibernateTemplate template;
	
	
	//Method to save User object.
	public void save(User user)
	{
		System.out.println("hiiiiiiiiiii");
		template.save(user);
		System.out.println("hello");
	}
	
	//Method to update User object.
	public void update(User user)
	{
		template.merge(user);
	}
	
	//Method to remove User object.
	public void remove(int id)
	{
		User user=(User)template.get(User.class, id);
		template.delete(user);
	}
	
	//Method to search a User using mailId and password
	public User find(String m, String p) 
	{
	   User user=null;
		List<User> list = (List<User>)template.find("from User as user where user.email=? and user.password=?", new String[]{m,p});
		if(list !=null && !list.isEmpty())
			user=list.get(0);
		
		return user;
	
	 }
	   
	 //Method to search a User using mailId
	 public boolean exists(String m) 
	 {
		  boolean flag=false;
		  
		  List<User> list= (List<User>)template.find("from User as user where user.email=?", new String[]{m});
		  
		  if(list !=null && !list.isEmpty())
			  flag=true;
				
		  return flag;
	  }
		
}
		   
		   
	