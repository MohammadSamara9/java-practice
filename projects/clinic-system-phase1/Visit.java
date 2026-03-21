package projectPhaseOne;
import java.util.*;
public abstract class Visit {
	//fields  
	private Date visitDate;
	private String symptoms;
	private String diagnosis;
	private Clinic clinic;
	
	
	//constructor without fields
	public Visit() {
		super();
	}


	//constructor using fields 
	public Visit(Date visitDate, String symptoms, String diagnosis, Clinic clinic) {
		super();
		this.visitDate = visitDate;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		this.clinic = clinic;
	}


	//setter and getter
	public Date getVisitDate() {
		return visitDate;
	}



	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}



	public String getSymptoms() {
		return symptoms;
	}



	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}



	public String getDiagnosis() {
		return diagnosis;
	}



	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}



	public Clinic getClinic() {
		return clinic;
	}



	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}


	//to string to print informations about patient
	@Override
	public String toString() {
		return "Visit [visitDate=" + visitDate + ", symptoms=" + symptoms + ", diagnosis=" + diagnosis + ", clinic="
				+ clinic + "]";
	}
	
	
	
	
	
	
	

}
