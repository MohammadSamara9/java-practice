package hhhh;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class FileManager {
	
	
	
	 public static void savePatientVisit(Patient p) throws IOException {
		 
		 File file=new File("patients.txt");
		 
		 FileWriter myWriter=new FileWriter(file,true);
		 
		 PrintWriter out=new PrintWriter(myWriter);
		 
		// prints all p fields
		 out.print("PATIENT|");
	     out.print(p.getName() + "|");
	     out.print(p.getDateOfBirth() + "|");
	     out.print(p.getGender() + "|");
	     out.print(p.getCity() + "|");
	     out.print(p.getOccupation() + "|");
	     out.println(p.isHasInsurance());
	     
	     
	  // prints all visit fields and incident
	        for (Visit v : p.getVisits()) {

	            out.print("visit|");
	            out.print(v.getVisitDate() + "|");
	            out.print(v.getSymptoms() + "|");
	            out.print(v.getDiagnosis() + "|");
	            
	            Clinic c = v.getClinic();
	            out.print("clinic|");
	            out.print(c.getClinicName() + "|");
	            out.print(c.getLocation() + "|");
	            out.print(c.getTelephone() + "|");

	            if (v instanceof Incident) {
	                Incident i = (Incident) v;
	                out.print("incident|");
	                out.print(i.getSeverity() + "|");
	                out.println(i.getBodyPart());
	            }
	        }
            
	        out.close();
	 }

}
