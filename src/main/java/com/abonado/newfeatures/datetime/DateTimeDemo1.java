package com.abonado.newfeatures.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeDemo1 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Date::" + date);
		System.out.println("Time::" + time);
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.printf("%d-%d-%d", day, month, year);
		
		int hour = time.getHour();
		int mins = time.getMinute();
		int secs = time.getSecond();
		int milsecs = time.getNano();
		System.out.println();
		System.out.printf("%d-%d-%d-%d", hour, mins, secs, milsecs);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println();
		
		System.out.println("localDateTime:::" + localDateTime);
		
		System.out.println(localDateTime.getDayOfMonth() + " " + localDateTime.getMonthValue() + " " + localDateTime.getYear());
		
		System.out.println(localDateTime.getHour() + " " + localDateTime.getMinute() + " " + localDateTime.getSecond() + " " + localDateTime.getNano());;
		
		LocalDate ld = LocalDate.of(2014, Month.MAY, 24);
		System.out.println("\n Saket Birth Day:" + ld);
		
		LocalDateTime ldt = LocalDateTime.of(2015, Month.MARCH, 25, 12 , 25 , 30, 6000);
		System.out.println("\n LocalDateTime:::::" + ldt);
		
		System.out.println("\n After 6 months::" + ldt.plusMonths(6));
		
		System.out.println("\n Before 6 weeks:::" + ldt.minusWeeks(6));
		
		//Change Date format
		
		Period p = Period.between(ld, LocalDate.now());
		System.out.println("Saket age::"+ p.getYears());
		
		
	}

}
