package hhhh;

public class Clinic {
	//fields
	private String clinicName;
	private String location;
	private String telephone;
	
	//constructor without fields
	public Clinic() {
		super();
	}

    //constructor using fields
	public Clinic(String clinicName, String location, String telephone) {
		super();
		this.clinicName = clinicName;
		this.location = location;
		this.telephone = telephone;
	}

    //setter and getter
	public String getClinicName() {
		return clinicName;
	}


	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

    //to string to print informations about clinic
	@Override
	public String toString() {
		return "Clinic [clinicName=" + clinicName + ", location=" + location + ", telephone=" + telephone + "]";
	}
	
	
	
	
	
	
	
	
	

}
