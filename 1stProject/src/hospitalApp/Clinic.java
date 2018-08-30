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
	
	// creating the schedule
	Map<Doctor, Appointment[]> schedule = new HashMap<>();
	
	// add doctor method
	public void addDoctor (Doctor d) {
		doctorList.add(d);
	}
	
	
	// add appointment from keyboard
	public void addAppointment () {
		System.out.println("To which doctor do you want to make the appointment?");
		Scanner in = new Scanner(System.in);
		String doctor = in.nextLine();
		
		/*
		System.out.println("What hour should the appointment be?");
		String hour = in.nextLine();
		
		System.out.println("The name of the patient?");
		String name = in.nextLine();
		*/
		
		for (Doctor d: schedule.keySet()) {
			// caut doctorul
			if (d.getName().equals(doctor)) {
		
				Appointment[] app = schedule.get(d);
				
				int nrProgramari = 0;
				
				for(int i=0; i < app.length; i++) {
					if(app[i] instanceof Appointment) {
						nrProgramari++;
					}
				}
				
				//System.out.println("doctor gasit" + doctor);
			} else {
				System.out.println("you entered a wrong doctor");
			}
		}
	}
	
}
