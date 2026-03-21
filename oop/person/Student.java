package person;


public class Student extends Person {
	
	private int stuId;
	
	public Student(String name,int stuId) {
		super(name);
		this.stuId=stuId;
		
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return super.toString() +"Student [stuId=" + stuId + "]";
	}
	
	
	
	

}
