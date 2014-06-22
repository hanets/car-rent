package com.epam.lab.model;

import java.sql.Date;

public class Rent {
	private User user;
	private Car car;
	private Date startDay;
	private Date finishDay;
	private Status status;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Date getStartDay() {
		return startDay;
	}
	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}
	public Date getFinishDay() {
		return finishDay;
	}
	public void setFinishDay(Date finishDay) {
		this.finishDay = finishDay;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
