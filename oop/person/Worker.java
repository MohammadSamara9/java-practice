package person;

public class Worker extends Person {
	
	private Double salary;

	
	
	public Worker() {
		super("null");
		this.salary=0.0;
		
	}
	
	
	
	public Worker(String name, Double salary) {
		super(name);
		this.salary = salary;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return super.toString()+"Worker [salary=" + salary + "]";
	}
	
	
	
	


	
	

}
