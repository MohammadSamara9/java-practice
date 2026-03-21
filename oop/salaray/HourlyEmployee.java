package salaray1;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double numberOfHoursWorked;
	
	
    



	public HourlyEmployee(String firstName, String lastName, int id, double wage, double numberOfHoursWorked) {
		super(firstName, lastName, id);
		this.wage = wage;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}



	public double getWage() {
		return wage;
	}



	public void setWage(double wage) {
		this.wage = wage;
	}



	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}



	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	
	
	
	
	

}
