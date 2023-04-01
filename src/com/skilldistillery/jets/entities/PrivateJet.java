package com.skilldistillery.jets.entities;

public class PrivateJet extends Jet{

	public PrivateJet() {
	}

	public PrivateJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		double flightTime = this.range / this.speed;
		System.out.println("The flight time is " + flightTime + " hours");
	}

	@Override
	public String toString() {
		return "PrivateJet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

}
