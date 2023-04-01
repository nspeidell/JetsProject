package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
@Override
	public void loadCargo() {
		System.out.println("Cargo is loaded");
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
		return "CargoPlane [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

}
