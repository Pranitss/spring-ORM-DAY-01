package com.asterisc.in.pack.model;


import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	
	
	public void inserted(Employee e)
	{
		temp.save(e);
	}
	
	
	public void update(Employee e)
	{
		temp.update(e);
	}
	
	

	public void delete(Employee e)
	{
		temp.delete(e);
	}
	
	

}
