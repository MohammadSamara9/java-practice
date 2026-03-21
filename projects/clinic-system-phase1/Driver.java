package projectPhaseOne;
import java.util.*;

//main class
public class Driver {
	//We defined it here static  to allow access from all methods
	public static Scanner inputScanner= new Scanner(System.in);
	public static ArrayList<Patient>patients=new ArrayList<Patient>();
	
	public static void main(String[] args) {
	//this variable to select the option
	int option=0;
	//while loop to keep the menu show until the customer enter number 6
	while(option!=6) {
		//menu
		System.out.println();
		System.out.println("1.New Blood Test visit.");
		System.out.println("2.New Alcohol Test visit.");
		System.out.println("3.New Incident visit.");
		System.out.println("4.New Immunization visit.");
		System.out.println("5.Print Patient visit information.");
		System.out.println("6.Exit.");
		System.out.println("chosse option: ");
		//read the number of option
		option= inputScanner.nextInt();
		inputScanner.nextLine();//clean the scanner
			
	//if and else if statement to determine	the correct operation	
	if(option==1) {
		bloodTest();
	   System.out.println("the blood test is done.");
	}else if(option==2) {
		alcoholTest();
		System.out.println("the alcohol test is done.");
	}else if(option==3) {
		incident();
		System.out.println("the incident test is done.");
	}else if(option==4) {
		immunization();
		System.out.println("the immunization test is done.");
	}else if(option==5) {
		
		System.out.println("enter the patient: ");
		String nameOfPatient=inputScanner.nextLine();
		nameOfPatient=nameOfPatient.trim();//to remove space and avoid errors
		
		//for loop Iterate over array list and search via name of patient and print all informations
		for(int i=0 ;i<patients.size();i++) {
			Patient p =patients.get(i);
			if(p.getName().trim().equalsIgnoreCase(nameOfPatient)) {
				System.out.println(p);
				for(int j=0;j<p.getVisits().size();j++) {
					Visit v=p.getVisits().get(j);
					((Reportable)v).generateReport();
				}
		    }	
		}	
	}else if(option==6) {
		System.out.println("thank you for visit us");
		return;//exit the while loop 
	}else
		System.out.println("ivaild option");//if the customer enter another number
		}
	}
	
	
	//this method read all information about patient and create patient object and added it in array list
	public static Patient patientInformations() {
		System.out.println("Enter the name of patient: ");
		String nameOfPatient=inputScanner.nextLine().trim();
		Patient isExisting =searchAboutPatient(nameOfPatient);
		if(isExisting!=null)
			return isExisting;
		
		System.out.println("Enter the date of birth: ");
		Date dateBirth=new Date(inputScanner.nextInt()-1900,inputScanner.nextInt()-1,inputScanner.nextInt());
		inputScanner.nextLine();//clean the scanner
		
		System.out.println("Enter the gender of patient: ");
		String gender=inputScanner.nextLine();
		
		System.out.println("Enter the city of patient: ");
		String city=inputScanner.nextLine();
		
		System.out.println("Enter the occupation of patient: ");
		String occupation=inputScanner.nextLine();
		
		System.out.println("Enter if the patient has insurance or no: ");
		boolean insurance =inputScanner.nextBoolean();
		inputScanner.nextLine();//clean the scanner
		
		Patient patient =new Patient(nameOfPatient,dateBirth,gender,city,occupation,insurance);
		patients.add(patient);
		
		return patient;
	}
	//this method read all information about clinic and create clinic object and added it in array list
	public static Clinic clinicInformations() {
		
		System.out.println("Enter the name of clinic: ");
		String nameOfClinic=inputScanner.nextLine();
		
		System.out.println("Enter the location of clinic: ");
		String location=inputScanner.nextLine();
		
		System.out.println("Enter the phone number of clinic: ");
		String phoneNumber=inputScanner.nextLine();
		
		Clinic clinic =new Clinic(nameOfClinic,location,phoneNumber);
		return clinic;
		
	}
	//this method call the two method patientInformations() clinicInformations() and read information about blood test 
	//and after that create blood test object and added it in array list 
	public static void bloodTest() {
		Patient patient=patientInformations();
		Clinic clinic= clinicInformations();


		System.out.println("Enter the date of visit: ");
		Date dateOfVisit=new Date(inputScanner.nextInt()-1900,inputScanner.nextInt()-1,inputScanner.nextInt());
		inputScanner.nextLine();//clean the scanner
		
		System.out.println("Enter the symptoms: ");
		String symptoms=inputScanner.nextLine();
		
		System.out.println("Enter the diagnosis: ");
		String diagnosis=inputScanner.nextLine();
		
		
		System.out.println("Enter the rbc: ");
		Double rbc=inputScanner.nextDouble();
		
		System.out.println("Enter the wbc: ");
		Double wbc=inputScanner.nextDouble();
		
		System.out.println("Enter the plt: ");
		Double plt=inputScanner.nextDouble();
		inputScanner.nextLine();//clean the scanner
		
		BloodTest bloodTest=new BloodTest(dateOfVisit,symptoms,diagnosis,clinic,rbc,wbc,plt);
		patient.addVisit(bloodTest);

	}
	
	//this method call the two method patientInformations() clinicInformations() and read information about alcohol test 
	//and after that create alcohol test object and added it in array list
	public static void alcoholTest() {
		Patient patient=patientInformations();
		Clinic clinic= clinicInformations();

		System.out.println("Enter the date of visit: ");
		Date dateOfVisit=new Date(inputScanner.nextInt()-1900,inputScanner.nextInt()-1,inputScanner.nextInt());
		inputScanner.nextLine();
		
		System.out.println("Enter the symptoms: ");
		String symptoms=inputScanner.nextLine();
		
		System.out.println("Enter the diagnosis: ");
		String diagnosis=inputScanner.nextLine();
		
		System.out.println("Enter the blood alcohol concentration: ");
		Double bloodAlcoholConcentration=inputScanner.nextDouble();
		inputScanner.nextLine();
		
		System.out.println("Enter the result: ");
		String result=inputScanner.nextLine();//clean the scanner
		
		AlcoholTest alcoholTest=new AlcoholTest(dateOfVisit,symptoms,diagnosis,clinic,bloodAlcoholConcentration,result);
		patient.addVisit(alcoholTest);

	}
	
	//this method call the two method patientInformations() clinicInformations() and read information about incident test 
	//and after that create incident test object and added it in array list
	public static void incident() {
		Patient patient=patientInformations();
		Clinic clinic= clinicInformations();

		System.out.println("Enter the date of visit: ");
		Date dateOfVisit=new Date(inputScanner.nextInt()-1900,inputScanner.nextInt()-1,inputScanner.nextInt());
		inputScanner.nextLine();
		
		System.out.println("Enter the symptoms: ");
		String symptoms=inputScanner.nextLine();
		
		System.out.println("Enter the diagnosis: ");
		String diagnosis=inputScanner.nextLine();
		
		
		System.out.println("Enter the severity: ");
		String severity=inputScanner.nextLine();
		
		System.out.println("Enter the bodyPart: ");
		String bodyPart=inputScanner.nextLine();
		
		Incident incident = new Incident(dateOfVisit,symptoms,diagnosis,clinic,severity,bodyPart);
		patient.addVisit(incident);
	}
	//this method call the two method patientInformations() clinicInformations() and read information about immunization test 
	//and after that create immunization test object and added it in array list
	public static void immunization() {
		Patient patient=patientInformations();
		Clinic clinic= clinicInformations();

		System.out.println("Enter the date of visit: ");
		Date dateOfVisit=new Date(inputScanner.nextInt()-1900,inputScanner.nextInt()-1,inputScanner.nextInt());
		inputScanner.nextLine();//clean the scanner
		
		System.out.println("Enter the symptoms: ");
		String symptoms=inputScanner.nextLine();
		
		System.out.println("Enter the diagnosis: ");
		String diagnosis=inputScanner.nextLine();
		
		System.out.println("Enter the vaccineName: ");
		String vaccineName=inputScanner.nextLine();
		
		System.out.println("Enter the dose: ");
		int dose=inputScanner.nextInt();
		inputScanner.nextLine();
		
	    Immunization immunization = new Immunization(dateOfVisit,symptoms,diagnosis,clinic,vaccineName,dose);
	    patient.addVisit(immunization);

	}	
	//search if the name is exist before
	public static Patient searchAboutPatient(String name) {
		
		String nameOfSearch =name.trim();
		for(int i=0 ;i<patients.size();i++) {
			Patient p =patients.get(i);
			if(p.getName().trim().equalsIgnoreCase(nameOfSearch)) {
				return p;
			}
		}

		return null;
	}
}
	
	
	
	


