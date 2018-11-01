package hospitalApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Clinic {
	
	Set<Doctor> doctorList = new HashSet<>();
	Set<Patient> patientList = new HashSet<>();
	ArrayList<Appointment> appointmentsGilmore = new ArrayList<>(16);
	ArrayList<Appointment> appointmentsMarble = new ArrayList<>(16);
	
	// creating the schedule
	Map<Doctor, ArrayList<Appointment>> schedule = new HashMap<>();
	
	// add doctor method
	public void addDoctor (Doctor d) {
		doctorList.add(d);
	}
	
	// add patient
	public void addPatient (Patient p) {
		patientList.add(p);
	}
	
	// add appointment to schedule
	public void addAppointment (Appointment a) {
		appointmentsGilmore.add(a);
		schedule.put(a.doctorAppointed, appointmentsGilmore);
		System.out.println(a.toString());
	}
	
	// add appointment from keyboard
	public void addAppointment () {
		System.out.println("To which doctor do you want to make the appointment?");
		Scanner in = new Scanner(System.in);
		String doctor = in.nextLine();
		

		System.out.println("What hour should the appointment be?");
		String hour = in.nextLine();
		
		System.out.println("The name of the patient?");
		String name = in.nextLine();

		
		for (Doctor d: schedule.keySet()) {
			// caut doctorul
			if(d.equals(doctor)) {
				
				
				//System.out.println("doctor gasit" + doctor);
			} else {
				System.out.println("you entered a wrong doctor");
			}
		}
	}
	
}
