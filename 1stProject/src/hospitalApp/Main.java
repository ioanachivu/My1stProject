package hospitalApp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

import exercitii.App;

public class Main {

	public static void main(String[] args) {
		
		Clinic clinic = new Clinic();
		
		// creating some doctor objects
		Doctor Gilmore = new Doctor("Mike Gilmore", "485691");
		Doctor Marble = new Doctor("Jason Marble", "897563");
		Doctor Behr = new Doctor("Gus Behr", "563784");
			
		// adding the doctor objects to the doctor list
		clinic.addDoctor(Gilmore);
		clinic.addDoctor(Marble);
		clinic.addDoctor(Behr);
		
		// creating some patients objects
		Patient SarahMiller = new Patient("Sarah Miller", "458967123845");
		Patient MichaelCross = new Patient("Michael Cross", "558945389675");
		Patient JessyDawn = new Patient("Jessy Dawn", "2189671286317");
		Patient ChristineDeen = new Patient("Christine Deen", "528967485697");
		Patient JaneDowe = new Patient("Jane Dowe", "856367125641");
		
		// adding the patient objects to the list
		clinic.patientList.add(SarahMiller);
		clinic.patientList.add(MichaelCross);
		clinic.patientList.add(JessyDawn);
		clinic.patientList.add(ChristineDeen);
		clinic.patientList.add(JaneDowe);
		
		// adaugi programari manual
		
		Appointment[] listAppointment = new Appointment[15];
		listAppointment[0] = new Appointment ("9;00", Gilmore, SarahMiller);
		listAppointment[0] = new Appointment ("9;30", Gilmore, MichaelCross);
		
		clinic.schedule.put(Gilmore, listAppointment);
		
		
		// cer de la tastatura doctor, pacient, si ora
		clinic.addAppointment();
		
		
		// verific daca pot adauga pacient la doctor in ora specificata
		

		// add appointment
		//clinic.addAppointment();
		
	} 
	
}
