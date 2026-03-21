package departmentAndTeacher;
import java.util.*;

public class Teacher {
	
	
	private String name;
	private  Date hireDate;
	
	
	public Teacher(String name,Date hireDate) {
		this.name=name;
		this.hireDate=hireDate;
	}
	
	public   void printTeacherInfo() {
		System.out.println("name:  " + name + "  Date:  " + hireDate);
	}
	
	
	
	
	

}
