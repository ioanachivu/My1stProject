package hospitalApp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Clinic {
	
	// creating the doctor list
	Set<Doctor> doctorList = new HashSet<>();
	
	// creating a patient list
	Set<Patient> patientList = new HashSet<>();
	
	// creating the array of appointments
	Appointment[] appointments = new Appointment[15];
	
	// creating the schedule
	Map<Doctor, Appointment> schedule = new HashMap<>();
	
	// add appointment from keyboard
	public void addAppointment () {
		System.out.println("To which doctor do you want to make the appointment?");
		Scanner in = new Scanner(System.in);
		String doctor = in.nextLine();
		

	}
	

}
