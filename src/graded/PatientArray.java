package graded;

import javax.swing.JOptionPane;

public class PatientArray {
	Patient[] myPatients = new Patient[10];
	String species = "";
	String breed = "";
	String gender = "";
	String age = "";
	String symptoms = "";
	String msg = "";
	
	public void buildArray() {
		myPatients[0] = new Patient();
		myPatients[0].setSpecies("Dog");
		myPatients[0].setBreed("Australian Sheppard");
		myPatients[0].setGender("Male");
		myPatients[0].setAge("6");
		myPatients[0].setSymptoms("Broken leg");
		myPatients[1] = new Patient();
		msg = "what is the Species";
		species = JOptionPane.showInputDialog(msg);
		myPatients[1].setSpecies(species);
		msg = "what is the breed?";
		breed = JOptionPane.showInputDialog(msg);
		myPatients[1].setBreed(breed);
		msg = "What is the gender (male, female, unknown)";
		gender = JOptionPane.showInputDialog(msg);
		myPatients[1].setGender(gender);
		msg = "How old is the " + species +"?";
		age = JOptionPane.showInputDialog(msg);
		myPatients[1].setAge(age);
		msg = "What symptoms are being expressed?";
		symptoms = JOptionPane.showInputDialog(msg);
		myPatients[1].setSymptoms(symptoms);
		myPatients[2] = new Patient();
		
		myPatients[3] = new Patient();
		
		myPatients[4] = new Patient();
		
		myPatients[5] = new Patient();
		
		myPatients[6] = new Patient();
		
		myPatients[7] = new Patient();
		
		myPatients[8] = new Patient();
		
		myPatients[9] = new Patient();
		

		
	}

	public void showArray() {
		for (int s=0; s<myPatients.length; s++) {
			

			System.out.println("Species: " + myPatients[s].getSpecies());
			System.out.println("Breed: " + myPatients[s].getBreed());
			System.out.println("Gender: " + myPatients[s].getGender());
			System.out.println("Age: " + myPatients[s].getAge());
			System.out.println("Symptoms: " + myPatients[s].getSymptoms());
			System.out.println();
		
	}

}//done
}
