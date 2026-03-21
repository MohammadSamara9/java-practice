package projectPhaseOne;
import java.util.*;
public class BloodTest extends Visit implements Reportable {
	//fields
	private double rbc;
	private double wbc;
	private double plt;
	
	//constructor without fields
	public BloodTest() {
		super();
	}

	//constructor using fields whit super constructor
	public BloodTest(Date visitDate, String symptoms, String diagnosis, Clinic clinic,double rbc, double wbc, double plt) {
		super(visitDate,symptoms,diagnosis,clinic);
		this.rbc = rbc;
		this.wbc = wbc;
		this.plt = plt;
	}
	

    //setter and getter
	public double getRbc() {
		return rbc;
	}

	public void setRbc(double rbc) {
		this.rbc = rbc;
	}

	public double getWbc() {
		return wbc;
	}

	public void setWbc(double wbc) {
		this.wbc = wbc;
	}

	public double getPlt() {
		return plt;
	}

	public void setPlt(double plt) {
		this.plt = plt;
	}

	//this method print informations about blood test
	@Override
	public void generateReport() {
		System.out.println("BLOOD TEST");
	    System.out.printf("Date: %s\nSymptoms: %s\nDiagnosis: %s\nClinic: %s\n ",getVisitDate(),getSymptoms(),getDiagnosis(),getClinic());
	    System.out.printf("RBC: %f\tWBC: %f\tPLT: %f\n",rbc,wbc,plt);
	}
	
	
	
	
	
	
	

}
