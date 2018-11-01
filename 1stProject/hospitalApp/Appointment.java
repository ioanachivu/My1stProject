package hospitalApp;

public class Appointment {

	public String hour;
	public Doctor doctorAppointed;
	public Patient patientToSee;
	
	public Appointment(String ora, Doctor doctorAppointed, Patient patientToSee) {
		super();
		this.hour = ora;
		this.patientToSee = patientToSee;
		this.doctorAppointed = doctorAppointed;
	}
	
	
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public Patient getPatientToSee() {
		return patientToSee;
	}

	public void setPatientToSee(Patient patientToSee) {
		this.patientToSee = patientToSee;
	}

	@Override
	public String toString() {
		return "Created: " + hour + ", doctor:" + doctorAppointed + ", patient:" + patientToSee;
	}

	
}
