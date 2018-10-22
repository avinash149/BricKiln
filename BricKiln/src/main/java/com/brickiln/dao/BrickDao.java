package com.brickiln.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.brickiln.entity.Brick;

@Repository
public class BrickDao {
	
		//Dependency of the Dao
		@Autowired
		HibernateTemplate template;
		
		
		//Method to save Brick object.
		public void save(Brick brick) 
		{
			template.save(brick);
		}
		
		//Method to update Brick object.
		public void update(Brick brick) 
		{
			template.merge(brick);
		}
		
		//Method to remove Brick object.
	    public void remove(int id) 
		{
		   Brick brick=(Brick)template.get(Brick.class, id);
		   template.delete(brick);		
		} 
		   
		//Method to load all the Brick
	    public List<Brick> allBrick() 
		{
	    	return (List<Brick>)template.find("from Brick as brick");
		}
	    
	    //Method to search a User using mailId and password
		public void find(int id) 
		{
			template.find("from Brick as brick where brick.id=?", new Integer(id));		
		}
}
		   
		   
	