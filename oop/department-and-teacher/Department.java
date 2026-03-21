package departmentAndTeacher;



public class Department {
	
	private String departmentName;
	private int numberOfTeacher;
	private Teacher[] teachers;
	
	public Department(String departmentName,int numberOfTeacher) {
		this.departmentName=departmentName;
		this.numberOfTeacher=numberOfTeacher;
		this.teachers=new Teacher[numberOfTeacher];
		
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfTeacher() {
		return numberOfTeacher;
	}
	
    public void addTeacher(Teacher teacher, int index) {
        if (index >= 0 && index < teachers.length) {
            teachers[index] = teacher;
        }
    }
    
    public Teacher[] getTeachers() {
        return teachers;
    }


	public void printDepartmentInfo() {
		System.out.println("departmentName: " + departmentName + "   numberOfTeacher:   " + numberOfTeacher );
		
	}




	
	
	
	
	
	
	
	
	

}
