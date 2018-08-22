package hospitalApp;

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
		clinic.doctorList.add(Gilmore);
		clinic.doctorList.add(Marble);
		clinic.doctorList.add(Behr);
		
		// adding some patients objects
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
		
		// creating some appointments
		Appointment appointment1 = new Appointment("9:00", Gilmore, SarahMiller);
		Appointment appointment2 = new Appointment("10:00", Gilmore, MichaelCross);
		Appointment appointment3 = new Appointment("11:00", Marble, JessyDawn);
		Appointment appointment4 = new Appointment("12:00", Marble, ChristineDeen);
		Appointment appointment5 = new Appointment("13:00", Behr, JaneDowe);
		
		// creating the schedule
		clinic.schedule.put(Gilmore, appointment1);
		clinic.schedule.put(Gilmore, appointment2);
		clinic.schedule.put(Marble, appointment3);
		clinic.schedule.put(Marble, appointment4);
		clinic.schedule.put(Behr, appointment5);
		
		// add appointment
		clinic.addAppointment();
		
	} 
	
}
