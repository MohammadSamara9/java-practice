package hhhh;


import java.util.*;

public class Patient {
	//fields
	private String name;
	private Date dateOfBirth;
	private String gender;
	private String city;
	private String occupation;
	private boolean hasInsurance;
	private ArrayList<Visit> visits;
	
	//constructor without fields
	public Patient() {
		super();
		visits=new ArrayList<Visit>();  //initialize the array list
	}

	//constructor using fields 
	public Patient(String name, Date dateOfBirth, String gender, String city, String occupation, boolean hasInsurance) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.city = city;
		this.occupation = occupation;
		this.hasInsurance = hasInsurance;
		visits=new ArrayList<Visit>();//initialize the array list
	}

	//setter and getter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public boolean isHasInsurance() {
		return hasInsurance;
	}


	public void setHasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}


	public ArrayList<Visit> getVisits() {
		return visits;
	}


	public void setVisits(ArrayList<Visit> visits) {
		this.visits = visits;
	}
	
	//add object of visit in array list 
	public void addVisit(Visit v) {
		visits.add(v);
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", city=" + city
				+ ", occupation=" + occupation + ", hasInsurance=" + hasInsurance + ", visits=" + visits + "]";
	}

	
	
	
	
	
	
	

}
