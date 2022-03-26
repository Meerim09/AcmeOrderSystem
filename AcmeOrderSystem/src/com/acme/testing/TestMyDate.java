package com.acme.testing;
import com.acme.utils.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 12, 2021);
		
		MyDate date2 = new MyDate();
		date2.setDay(11);
		date2.setMonth(10);
		date2.setYear(1918);
		
		MyDate date3 = new MyDate();
		date3.setDate(13, 9, 2021);
		
		MyDate myBD = new MyDate(9, 12, 2001);
		MyDate testBD =new MyDate(9, 12, 2001);
		
		if(myBD.equals(testBD))
			System.out.println("These two dates are equal");
		else
		    System.out.println("These two dates are not equal");
		
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);	
		
		MyDate.leapYears();

     	MyDate.listHolidays();
}
}