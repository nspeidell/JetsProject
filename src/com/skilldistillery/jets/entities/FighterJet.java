package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{
	
	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void dogFight() {
		System.out.println("I got him on lock");
		System.out.println("Missiles engaged");
		System.out.println("Firing");
		System.out.println("Bingo");
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
		return "FighterJet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

}
