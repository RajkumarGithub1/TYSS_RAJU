package com.Vtiger.GenericLibraries;

import com.github.javafaker.Faker;

public class FakerData
{
	
	/**
	 * @author DELL
	 * This method will create and return FirstName  
	 * @return String firstName
	 */
	public String getFirstName()
	{
		Faker f=new Faker();
		String firstName = f.name().firstName();
		return firstName;
	}
	
	
	/**
	 * @author DELL
	 * This method will create and return lastName  
	 * @return String lastName
	 */
	public String getlastName()
	{
		Faker f1=new Faker();
		String lastName = f1.name().lastName();
		return lastName;
	}
	
	
	/**
	 * @author DELL
	 * This method will create and return companyName  
	 * @return String companyName
	 */
	public String getCompanyName()
	{
		Faker f2=new Faker();
		String companyName = f2.company().name();
		return companyName;
	}
	
	/**
	 * @author DELL
	 * This method will create and return companyRevenue between 1 - 2 digits 
	 * @return int companyRevenue
	 */

	public int  getCompanyRevenue()
	{
		Faker f3=new Faker();
		int companyRevenue = f3.number().randomDigitNotZero();
		//System.out.println(companyRevenue);
		return companyRevenue;
	}
	
	
	
	
	
}
