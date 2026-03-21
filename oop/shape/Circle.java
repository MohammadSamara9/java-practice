package shape;

public class Circle extends Shape {
	
	protected double radius;
	
	

	public Circle() {
		super();
	}
	
	

	public Circle(String color, boolean filled , double radius) {
		super(color, filled);
		this.radius=radius;
		
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public  double getArea() {
		return Math.PI *radius *radius;
	}
	
	
	

	
	
	
	



}
