package com.flightbooking.bookingms.model;

import java.util.Date;

public class FlightDetails {

	String PickupLocation;
	String destinationLocation;
	Date travelDate;
	String travelTime;
	String flightName;
	double ticketCost;
	
	public FlightDetails(String pickupLocation, String destinationLocation, Date travelDate, String travelTime,
			String flightName, double ticketCost) {
		super();
		PickupLocation = pickupLocation;
		this.destinationLocation = destinationLocation;
		this.travelDate = travelDate;
		this.travelTime = travelTime;
		this.flightName = flightName;
		this.ticketCost = ticketCost;
	}

	public FlightDetails() {
		super();
	}

	public String getPickupLocation() {
		return PickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		PickupLocation = pickupLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "FlightDetails [PickupLocation=" + PickupLocation + ", destinationLocation=" + destinationLocation
				+ ", travelDate=" + travelDate + ", travelTime=" + travelTime + ", flightName=" + flightName
				+ ", ticketCost=" + ticketCost + "]";
	}
	
	
}
