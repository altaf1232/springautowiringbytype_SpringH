package com.springautowiringbytype;

public class Emp_a 
{
   private Address addres;

public Address getAddres() {
	return addres;
}

public void setAddres(Address addres) 
{
	this.addres = addres;
}

public Emp_a()
{
	super();
	// TODO Auto-generated constructor stub
}

public Emp_a(Address addres) 
{
	super();
	this.addres = addres;
}

@Override
public String toString() 
{
	return "Emp_a [addres=" + addres + "]";
}
  
}