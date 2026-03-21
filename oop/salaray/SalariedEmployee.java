package salaray1;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	

    


	public SalariedEmployee(String firstName, String lastName, int id, double weeklySalary) {
		super(firstName, lastName, id);
		this.weeklySalary = weeklySalary;
	}


	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	
	
	
	

}
