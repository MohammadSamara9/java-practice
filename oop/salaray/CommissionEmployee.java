package salaray1;

public class CommissionEmployee extends Employee {
	
	private double rate;
	private double grossRate;
	
	
	
	public CommissionEmployee(String firstName, String lastName, int id, double rate, double grossRate) {
		super(firstName, lastName, id);
		this.rate = rate;
		this.grossRate = grossRate;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	public double getGrossRate() {
		return grossRate;
	}



	public void setGrossRate(double grossRate) {
		this.grossRate = grossRate;
	}
	
	
	
	
	

}
