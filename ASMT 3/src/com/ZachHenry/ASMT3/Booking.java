/**
 * 
 */
package com.ZachHenry.ASMT3;



/**
 * @author Zach Henry
 *
 */
public class Booking {
	
	private String date, departLocation,departTime,arriveLocation,arriveTime;
	private int flightNumber,miles;
	//Create an Array to hold the bookings and an .add() to add data to bookings
	/**
	 * @param date
	 * @param departLocation
	 * @param departTime
	 * @param arriveLocation
	 * @param arriveTime
	 * @param flightNumber
	 * @param miles
	 */
	public Booking(String date,int flightNumber, String departLocation, String departTime, String arriveLocation, String arriveTime,int miles) {
		super();
		this.date = date;
		this.departLocation = departLocation;
		this.departTime = departTime;
		this.arriveLocation = arriveLocation;
		this.arriveTime = arriveTime;
		this.flightNumber = flightNumber;
		this.miles = miles;
	}
	

	

}
