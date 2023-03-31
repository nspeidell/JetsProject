package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	//populate the fleet from the file
	
	
	
	
	//only the airfield talks directly to the jet parled, the application 
	//has to go trhough the airfield to talk to the jets (oark the car)
	    private List<Jet> fleet;
	    String fileName = "jets.txt";
	    public List<Jet> readFromFile(String fileName) {
	    		List<Jet> jets = new ArrayList<>();
	    		//read in the various jet types from the file,  
	    		try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
	    			  String ajet;
	    			  while ((ajet = bufIn.readLine()) != null) {
	    				  //as you read in a jet, create= (new jet) a jet.
	    				 String[] jetDetails = ajet.split(",");
	    				 // create the app. jet based on details
	    				 //if the jet details in the first position happens to be a fighter then create a fighter jet
	    			    System.out.println(ajet);
	    			  }
	    			}
	    			catch (IOException e) {
	    			  System.err.println(e);
	    			}
	    		// and add that specific jet type to your jet list

	    		return jets;
	    }
}
