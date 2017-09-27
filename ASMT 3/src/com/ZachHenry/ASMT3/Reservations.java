/**
 * 
 */
package com.ZachHenry.ASMT3;

import java.time.LocalDate;

/**
 * @author Zach Henry
 *
 */
public class Reservations {

	// Date of Flight, Flight type, seat
	private LocalDate flightDate;
	private String flightSeat;
	private Flights flight;
	/**
	 * @return the flightDate
	 */
	public LocalDate getFlightDate() {
		return flightDate;
	}
	/**
	 * @return the flightSeat
	 */
	public String getFlightSeat() {
		return flightSeat;
	}
	/**
	 * @return the flight
	 */
	public Flights getFlight() {
		return flight;
	}
}
