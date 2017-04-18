package com.sadi.newtours1.dto;

public class FlightFinder {
	private String flightType;
	private String passengesNumber;
	private String departingForm;
	private String departingFormMonth;
	private String departingFormDate;
	private String arrivingIn;
	private String returningMonth;
	private String returningDate;
	private String serviceClass;
	private String airlineName;
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public String getPassengesNumber() {
		return passengesNumber;
	}
	public void setPassengesNumber(String passengesNumber) {
		this.passengesNumber = passengesNumber;
	}
	public String getDepartingForm() {
		return departingForm;
	}
	public void setDepartingForm(String departingForm) {
		this.departingForm = departingForm;
	}
	public String getDepartingFormMonth() {
		return departingFormMonth;
	}
	public void setDepartingFormMonth(String departingFormMonth) {
		this.departingFormMonth = departingFormMonth;
	}
	public String getDepartingFormDate() {
		return departingFormDate;
	}
	public void setDepartingFormDate(String departingFormDate) {
		this.departingFormDate = departingFormDate;
	}
	public String getArrivingIn() {
		return arrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}
	public String getReturningMonth() {
		return returningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public String getReturningDate() {
		return returningDate;
	}
	public void setReturningDate(String returningDate) {
		this.returningDate = returningDate;
	}
	public String getServiceClass() {
		return serviceClass;
	}
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String toString() {
		return "FlightFinder [ flightType = "+ flightType +", passengesNumber = "+ passengesNumber +", departingForm = "+ departingForm +", departingFormMonth = "+ departingFormMonth +", departingFormDate = "+ departingFormDate +", arrivingIn = "+ arrivingIn +", returningMonth ="+ returningMonth +", returningDate = "+ returningDate +", serviceClass = "+ serviceClass +", airlineName = "+ airlineName +" ]";
	}

}
