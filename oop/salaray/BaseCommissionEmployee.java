package salaray1;

public class BaseCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BaseCommissionEmployee(String firstName, String lastName, int id, double rate, double grossRate,
			double baseSalary) {
		super(firstName, lastName, id, rate, grossRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	

}
