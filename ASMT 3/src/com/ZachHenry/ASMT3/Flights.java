/**
 * 
 */
package com.ZachHenry.ASMT3;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Zach Henry
 *
 */
public class Flights {
	

	private String departLocation,arriveLocation;
	private int flightNumber,miles;
	private LocalDate date;
	private LocalTime departTime,arriveTime;
	/**
	 * @param departLocation
	 * @param arriveLocation
	 * @param flightNumber
	 * @param miles
	 * @param date
	 * @param departTime
	 * @param arriveTime
	 */
	public Flights(String departLocation, String arriveLocation, int flightNumber, int miles, LocalDate date,
			LocalTime departTime, LocalTime arriveTime) {
		super();
		this.departLocation = departLocation;
		this.arriveLocation = arriveLocation;
		this.flightNumber = flightNumber;
		this.miles = miles;
		this.date = date;
		this.departTime = departTime;
		this.arriveTime = arriveTime;
	}
	
	
}
