package com.ramesh;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		//Login
		System.out.println("************************************");
		System.out.println("--------------Login page------------");
		System.out.println();
		System.out.print("Enter your mobile number: ");//get mobile number from user
		Long mobNo=sc.nextLong();
		String mobNoString=String.valueOf(mobNo);
		if(mobNoString.length()==10)//check whether the number is valid or not
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
		System.out.print("Enter you password: ");//get password from user
		String password=sc.next();
	    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";//password patter (eg: 123aaAA@a)  
	    if(password.matches(pattern))//check whether the password is correct or not
	    {
	    	System.out.println("Submit");
	    }
	    else
	    {
	    	System.out.println("invalid password");
	    }
		
	    System.out.println("***************************************");
	    
	    //cab_type
	    
	    System.out.println();
	    System.out.println("***************************************");
	    
	    System.out.print("Enter your cab type: ");
	    String cabType=sc.next();
	    if(cabType.equalsIgnoreCase("micro")) {
	    	System.out.println("micro Rs.10/km");
	    }
	    else if(cabType.equalsIgnoreCase("mini")) {
	    	System.out.println("mini Rs.15/km");
	    }
	    else if(cabType.equalsIgnoreCase("prime")) {
	    	System.out.println("prime Rs.20/km");
	    }
	    else {
	    	System.out.println("invalid car type");
	    }
	    
	    System.out.println("***************************************");
	    
	    //Price_Estimation
	    
	    System.out.println();
	    System.out.println("***************************************");
	    System.out.println("------------Price Estimation-----------");
	    
	    System.out.println("Enter the distance: ");
	    int km=sc.nextInt();//get distance from user
	    int rate=0;
	    if(cabType.equalsIgnoreCase("micro")) {
	    	rate=km*10;
	    	System.out.println("your price is: "+rate);
	    }
	    else if(cabType.equalsIgnoreCase("mini")) {
	    	rate=km*15;
	    	System.out.println("your price is: "+rate);
	    }
	    else if(cabType.equalsIgnoreCase("prime")) {
	    	rate=km*20;
	    	System.out.println("your price is: "+rate);
	    }
	    else {
	    	System.out.println("invalid car type");
	    }
	    System.out.println("***************************************");
	    
	    //price estimation with GST
	    
	    System.out.println();
	    System.out.println("***************************************");
	    System.out.println("---------Price Estimation with GST-------");
	    
	    double gst=rate+(rate*(7.0/100));//calculate gst
	    System.out.println("Your toatal price is: "+gst);
	    
	    System.out.println("***************************************");
	    
	    //Booking
	    
	    System.out.println();
	    System.out.println("***************************************");
	    System.out.println("---------Pre reservation booking-------");
	    
	    System.out.print("Enter your cab type: ");
	    String r_cabType=sc.next();//get the cab type from user
	    if(r_cabType.equalsIgnoreCase("micro"))//check which cab type you have booked
	    {
	    	System.out.println("you have booked micro");
	    }
	    else if(r_cabType.equalsIgnoreCase("mini")) {
	    	System.out.println("you have booked mini");
	    }
	    else if(r_cabType.equalsIgnoreCase("prime")) {
	    	System.out.println("you have booked prime");
	    }
	    else {
	    	System.out.println("invalid car type");
	    }
	    
	    System.out.println("Enter your journey date: ");
	    String date=sc.next();//get the date of journey from user
	    System.out.println("Enter your pickup time: ");
	    String time=sc.next();//get the time of journey from user
	    System.out.println("You have reseved your bookinng");
	    
	    System.out.println("***************************************");
	    
	    System.out.println();
	    System.out.println("***************************************");
	    System.out.println("---------------Peak hours--------------");
	    
	    LocalTime cabTime=LocalTime.parse("17:00");//choose the value for travel
		int hour=cabTime.getHour();
		System.out.println("hour : "+hour);
		if(hour>=17 && hour<=19)//chcek whether the given value is peaks hours or not
		{
			System.out.println("peak hours");
			
			double p_rate=0;
			System.out.println("Enter your cab type: ");//Choose yor car type
			String p_cabType=sc.next();
		    if(p_cabType.equalsIgnoreCase("micro")) //check the price for the choosen car
		    {
		    	p_rate=km*(10+1.5);
		    	System.out.println("your price is: "+p_rate);
		    }
		    else if(p_cabType.equalsIgnoreCase("mini")) {
		    	p_rate=km*(15+1.5);
		    	System.out.println("your price is: "+p_rate);
		    }
		    else if(p_cabType.equalsIgnoreCase("prime")) {
		    	p_rate=km*(20+1.5);
		    	System.out.println("your price is: "+p_rate);
		    }
		    else {
		    	System.out.println("invalid car type");
		    }
		}
		
		System.out.println("***************************************");
		
		System.out.println();
	    System.out.println("***************************************");
	    System.out.println("-------------Senior citizen------------");
	    
	    System.out.println("Enter your DOB: ");//Get DOB from user
	    String dob=sc.next();
		LocalDate d=LocalDate.parse(dob);
		Period age= Period.between(d,LocalDate.now());
		int discount=0;
		if(age.getYears()>=60) //Check whether customer is eligible for discount ot not
		{
			System.out.println("You are eligible for discount");
			discount=discount+rate/2;
			System.out.println("Your total price is :"+discount);
		}
		else {
			System.out.println("You are not eligible for discount");
		}
	    
		System.out.println("***************************************");
		
		sc.close();
	}

}
