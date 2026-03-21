package hhhh;
import java.util.*;
public class Incident extends Visit implements Reportable {
	//fields
	private String severity;
	private String bodyPart;
	
	//constructor without fields
	public Incident() {
		super();
	}

	//constructor using fields whit super constructor
	public Incident(Date visitDate, String symptoms, String diagnosis, Clinic clinic,String severity, String bodyPart) {
		super(visitDate,symptoms,diagnosis,clinic);
		this.severity = severity;
		this.bodyPart = bodyPart;
	}

	//setter and getter
	public String getSeverity() {
		return severity;
	}


	public void setSeverity(String severity) {
		this.severity = severity;
	}


	public String getBodyPart() {
		return bodyPart;
	}


	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}
	
	
	//this method print informations about immunization test
	@Override
	public void generateReport() {
		System.out.println("INCIDENT");
	    System.out.printf("Date: %s\nSymptoms: %s\nDiagnosis: %s\nClinic: %s\n ",getVisitDate(),getSymptoms(),getDiagnosis(),getClinic());
	    System.out.printf("severity: %s\tbody Part: %s\n",severity,bodyPart);
	}
	
	
	
	

}
