package com.sapient.toString;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate my_birth = new MyDate(22, 7, 1964);
		MyDate the_next_week = my_birth.addDays(7);
		
		System.out.println(the_next_week);
		System.out.println(my_birth);
	}

}

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate addDays(int days){
		return new MyDate(day+days, month, year);
	}
	
	public String toString(){
		return new String("The date is: "+day+"/"+month+"/"+year);
	}
	
}
