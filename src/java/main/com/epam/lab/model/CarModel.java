package com.epam.lab.model;

public class CarModel {
	private int id;
	private CarBrand carBrand;
	private String model;
	private double dayCost;
	private double fullCost; 
	private int year;
	private boolean automaticGearBox;
	private boolean airCondit;
	private int seats;
	private int doorsNumber;
	private double engineCapacity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CarBrand getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getDayCost() {
		return dayCost;
	}
	public void setDayCost(double dayCost) {
		this.dayCost = dayCost;
	}
	public double getFullCost() {
		return fullCost;
	}
	public void setFullCost(double fullCost) {
		this.fullCost = fullCost;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAutomaticGearBox() {
		return automaticGearBox;
	}
	public void setAutomaticGearBox(boolean automaticGearBox) {
		this.automaticGearBox = automaticGearBox;
	}
	public boolean isAirCondit() {
		return airCondit;
	}
	public void setAirCondit(boolean airCondit) {
		this.airCondit = airCondit;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getDoorsNumber() {
		return doorsNumber;
	}
	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
}
