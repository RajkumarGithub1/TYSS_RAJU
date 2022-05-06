package com.Vtiger.GenericLibraries;

import java.util.Date;
import java.util.Random;

public class JavaUtilRandom 
{
	
	public int createRandomnumber() 
	{
		Random random = new Random();
		int number=random.nextInt(1002);
		return number;
	}
	
	public String getDate() 
	{
		Date date = new Date();
		return date.toString();
	}

}
