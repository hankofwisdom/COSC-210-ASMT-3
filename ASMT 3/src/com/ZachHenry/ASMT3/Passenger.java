/**
 * 
 */
package com.ZachHenry.ASMT3;

/**
 * @author Zach Henry
 * This class creates the Passenger which takes a Name and Number
 */
public class Passenger {
	private String name, flyerNumber;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @return the flyerNumber
	 */
	public String getFlyerNumber() {
		return flyerNumber;
	}

	/**
	 * @param name
	 * @param flyerNumber
	 */
	public Passenger(String name, String flyerNumber) {
		super();
		this.name = name;
		this.flyerNumber = flyerNumber;
	}

}
