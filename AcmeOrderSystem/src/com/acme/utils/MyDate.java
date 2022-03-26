package com.acme.utils;

public class MyDate {
   private byte day;
   private byte month;
   private short year;
  
   private static MyDate[] holidays;
   static {
	   holidays = new MyDate[6];
	   holidays[0] = new MyDate(1, 1, 2021);
	   holidays[1] = new MyDate(30, 5, 2021);
	   holidays[2] = new MyDate(7, 4, 2021);
	   holidays[3] = new MyDate(9, 5, 2021);
	   holidays[4] = new MyDate(24,11, 2021);
	   holidays[5] = new MyDate(25, 12, 2021);

   }
   public static MyDate[] getHolidays() {
	   return holidays;
   }
   public static void listHolidays() {
	   System.out.println("The holidays are:");
	   for (int x = 0; x < holidays.length; x++) {
	   System.out.println(holidays[x]);
   }
}
   	public MyDate() {
   	   this(1, 1, 1900);
    }
    
    public MyDate(int d, int m, int y) {
    	setDate(d, m, y);
    }
    
    public String toString(){
    	return getDay() + "/" + getMonth() + "/" + getYear();
    }
    
    public void setDate(int d, int m, int y) {
         if(valid(d, m, y)) {
        	 day = (byte) d;
        	 year = (short) y;
        	 month = (byte) m;
         }
    }
    public static void leapYears() {
    	for(int i = 1752; i < 2020; i = i + 4) {
    		if((i % 100 != 0) || (i % 400 == 0)) {
    			System.out.println("The year " + i + " is a leap year");
    		}
    	}
    }

	public int getDay() {
		return day;
	}

	 public void setDay(int day) {
 		 if(valid(day, month, year)) {
 			 this.day = (byte)day;
 		 }
	 }

	 public int getMonth() {
		return month;
	}

	 public void setMonth(int month) {
		if(valid(day, month, year)) {
			 this.month = (byte)month;
		 }
	}

	 public int getYear() {
		return year;
	}

	 public void setYear(int year) {
		if(valid(day, month, year)) {
			this.year = (short) year;
		}
	}
	
	private boolean valid(int day, int month, int year) {
		if (day > 31 || day < 1 || month > 12 || month <1) {
			System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
		}
		switch (month) {
		   case 4:
		   case 6:
		   case 9:
		   case 11: return (day <= 30);
		   case 2: return day <= 28 || (day == 29 && year  % 4 == 0);
		}
		return true;
	}
	
	public boolean equals(Object o) {
		if (o instanceof MyDate)
		{
			MyDate d = (MyDate) o;
		    if ((d.day == day) && (d.month == month) && (d.year == year)) {
		    	return true;
			}
		}
		return false;
		}
}
