package projectPhaseOne;
import java.util.*;
public class AlcoholTest extends Visit implements Reportable {
	//fields
	private double bloodAlcoholConcentration;
	private String result;
	
	//constructor without fields
	public AlcoholTest() {
		super();
	}

	//constructor using fields whit super constructor
	public AlcoholTest(Date visitDate, String symptoms, String diagnosis, Clinic clinic,double bloodAlcoholConcentration, String result) {
		super(visitDate,symptoms,diagnosis,clinic);
		this.bloodAlcoholConcentration = bloodAlcoholConcentration;
		this.result = result;
	}

    //setter and getter
	public double getBloodAlcoholConcentration() {
		return bloodAlcoholConcentration;
	}


	public void setBloodAlcoholConcentration(double bloodAlcoholConcentration) {
		this.bloodAlcoholConcentration = bloodAlcoholConcentration;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	//this method print informations about alcohol test
	@Override
	public void generateReport() {
		System.out.println("ALCOHOL TEST");
	    System.out.printf("Date: %s\nSymptoms: %s\nDiagnosis: %s\nClinic: %s\n ",getVisitDate(),getSymptoms(),getDiagnosis(),getClinic());
	    System.out.printf("Blood Alcohol Concentration: %f\tresult: %s\n",bloodAlcoholConcentration,result);
	}
	
	
	
	

}
