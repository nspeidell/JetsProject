package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}

	private void launch() {
		Scanner kb = new Scanner(System.in);
		AirField af = new AirField();
		String fileName = "jets.txt";
		af.readJets(fileName);
		boolean menuLoop = true;
		do {
			menu();
			int menuSelection = kb.nextInt();
			if (menuSelection == 1) {
				System.out.println(af.getFleet());

			} else if (menuSelection == 2) {
				for (Jet jet : af.getFleet()) {
					jet.fly();
				}
			} else if (menuSelection == 3) {
				fastestJet(af);
			} else if (menuSelection == 4) {
				longestJet(af);
			} else if (menuSelection == 5) {
				CargoCarrier loadIt = new CargoPlane();
				loadIt.loadCargo();
			} else if (menuSelection == 6) {
				CombatReady letsFight = new FighterJet();
				letsFight.dogFight();
			} else if (menuSelection == 7) {
				addJet(af);
			} else if (menuSelection == 8) {
			List<Jet> displayFleet = af.getFleet();
				for (int i = 0; i > af.getFleet().size(); i++)
					System.out.println(displayFleet);
				System.out.println("Select 1 to 5 to remove a jet");
				int removeJet = kb.nextInt();
				af.remove(removeJet);
				System.out.println(af.getFleet());
			} else if (menuSelection == 9) {
				System.out.println("You have chosen to quit, goodbye!");
				menuLoop = false;
			}
		} while (menuLoop != false);
	}

	private void menu() {
		System.out.println("************Menu************");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to fleet");
		System.out.println("8. Remove a jet from the fleet");
		System.out.println("9. Quit");
	}

	private void addJet(AirField af) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter  new jet");
		System.out.println("model?");
		String model = kb.next();
		System.out.println("speed");
		double speed = kb.nextDouble();
		System.out.println("range");
		int range = kb.nextInt();
		System.out.println("price");
		long price = kb.nextLong();
		Jet addingJet = new CargoPlane(model, speed, range, price);
		af.getFleet().add(addingJet);
	}

	private void fastestJet(AirField af) {
		Jet fastestJet = new CargoPlane();
		for (Jet jet : af.getFleet()) {
			if (jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println("The fastest jet in the fleet is: " + "\n" + fastestJet);
	}

	private void longestJet(AirField af) {	
		Jet longestJet = new CargoPlane();
		for (Jet jet : af.getFleet()) {
			if (jet.getRange() > longestJet.getRange()) {
				longestJet = jet;
			}
		}
		System.out.println("The longest range jet in the fleet is: " + "\n" + longestJet);
	}
}
