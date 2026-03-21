package projectPhaseOne;
import java.util.*;
public class Immunization extends Visit implements Reportable {
	//fields
	private String vaccineName;
	private int dose;
	
	//constructor without fields
	public Immunization() {
		super();
	}

	//constructor using fields whit super constructor
	public Immunization(Date visitDate, String symptoms, String diagnosis, Clinic clinic,String vaccineName, int dose) {
		super(visitDate,symptoms,diagnosis,clinic);
		this.vaccineName = vaccineName;
		this.dose = dose;
	}

	//setter and getter
	public String getVaccineName() {
		return vaccineName;
	}


	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}


	public int getDose() {
		return dose;
	}


	public void setDose(int dose) {
		this.dose = dose;
	}
	
	//this method print informations about immunization test
	@Override
	public void generateReport() {
		System.out.println("IMMUNIZATION");
	    System.out.printf("Date: %s\nSymptoms: %s\nDiagnosis: %s\nClinic: %s\n ",getVisitDate(),getSymptoms(),getDiagnosis(),getClinic());
	    System.out.printf("vaccine Name: %s\tdose: %d\t",vaccineName,dose);
	}
	
	
	
	

}
