package hospitalApp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

import exercises.App;

public class Main {

	public static void main(String[] args) {
		
		Clinic clinic = new Clinic();
		
		// creating some doctor objects
		Doctor Gilmore = new Doctor("Mike Gilmore","2569874563","485691");
		Doctor Marble = new Doctor("Jason Marble","6589743681","897563");
			
		// adding the doctor objects to the doctor list
		clinic.addDoctor(Gilmore);
		clinic.addDoctor(Marble);
		
		// creating some patients objects
		Patient SarahMiller = new Patient("Sarah Miller", "458967123845", 1025);
		Patient MichaelCross = new Patient("Michael Cross", "558945389675",1359);
		Patient JessyDawn = new Patient("Jessy Dawn", "2189671286317",1489);
		Patient ChristineDeen = new Patient("Christine Deen", "528967485697",7863);
		Patient JaneDowe = new Patient("Jane Dowe", "856367125641",5812);
		
		// adding the patient objects to the list
		clinic.addPatient(SarahMiller);
		clinic.addPatient(MichaelCross);
		clinic.addPatient(JessyDawn);
		clinic.addPatient(ChristineDeen);
		clinic.addPatient(JaneDowe);
		
		// adaugi programari manual
		
		Appointment app1 = new Appointment ("9;00", Gilmore, SarahMiller);
		Appointment app2 = new Appointment ("9;30", Gilmore, MichaelCross);
		
		clinic.addAppointment(app1);
		clinic.addAppointment(app2);
		
		
		// cer de la tastatura doctor, pacient, si ora
		//clinic.addAppointment();
		
		
		// verific daca pot adauga pacient la doctor in ora specificata
		

		// add appointment
		//clinic.addAppointment();
		
	} 
	
}
