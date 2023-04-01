package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> fleet = new ArrayList<>();

	// only the airfield talks directly to the jet parked, the application
	// has to go through the airfield to talk to the jets (park the car)

	// read in the various jet types from the file,
	public List<Jet> readJets(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String ajet;
			while ((ajet = bufIn.readLine()) != null) {
				String[] jetDetails = ajet.split(",");
				String jetType = jetDetails[0];
				if (jetType.equals("PassengerJet")) {
					String model = jetDetails[1];
					double speed = Double.parseDouble(jetDetails[2]);
					int range = Integer.parseInt(jetDetails[3]);
					long price = Long.parseLong(jetDetails[4]);
					Jet j = new PassengerJet(model, speed, range, price);
					getFleet().add(j);
				} else if (jetType.equals("PrivateJet")) {
					String model = jetDetails[1];
					double speed = Double.parseDouble(jetDetails[2]);
					int range = Integer.parseInt(jetDetails[3]);
					long price = Long.parseLong(jetDetails[4]);
					Jet j = new PrivateJet(model, speed, range, price);
					getFleet().add(j);
				} else if (jetType.equals("CargoPlane")) {
					String model = jetDetails[1];
					double speed = Double.parseDouble(jetDetails[2]);
					int range = Integer.parseInt(jetDetails[3]);
					long price = Long.parseLong(jetDetails[4]);
					Jet j = new CargoPlane(model, speed, range, price);
					getFleet().add(j);
				} else if (jetType.equals("Fighter")) {
					String model = jetDetails[1];
					double speed = Double.parseDouble(jetDetails[2]);
					int range = Integer.parseInt(jetDetails[3]);
					long price = Long.parseLong(jetDetails[4]);
					Jet j = new FighterJet(model, speed, range, price);
					getFleet().add(j);
				} else if (jetType.equals("StealthJet")) {
					String model = jetDetails[1];
					double speed = Double.parseDouble(jetDetails[2]);
					int range = Integer.parseInt(jetDetails[3]);
					long price = Long.parseLong(jetDetails[4]);
					Jet j = new StealthJet(model, speed, range, price);
					getFleet().add(j);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return getFleet();
	}

	public List<Jet> getFleet() {
		return fleet;
	}

	public void setFleet() {
		this.fleet = fleet;
	}

	public void remove(int removeJet) {
	this.fleet.remove(removeJet);
		
	}
	
}
