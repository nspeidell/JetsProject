package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet{
	

	public PassengerJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		//amount of time jet can fly before running out of fuel
		System.out.println(this.toString());
		double flightTime = this.range / this.speed;
		System.out.println("The flight time is " + flightTime + " hours");
	}

	@Override
	public String toString() {
		return "PassengerJet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	}

