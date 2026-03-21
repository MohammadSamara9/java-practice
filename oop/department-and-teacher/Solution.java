package departmentAndTeacher;

import java.util.Date;

public class Solution {

	public static void main(String[] args) {
		Department ENCS=new Department("ENCS" ,2);
		Department CS=new Department("CS" ,1);
		Department[] department= {ENCS,CS};
		
		
		
		Teacher teacherOne=new Teacher("mohammed", new Date(2,4,2020));
		Teacher teacherTwo=new Teacher("ahmad", new Date(9,6,2010));
		Teacher teacherThree=new Teacher("mosa", new Date(27,9,2025));
		
		
		
		department[0].addTeacher(teacherOne, 0);
		department[0].addTeacher(teacherTwo, 1);
		department[1].addTeacher(teacherThree, 0);
		
		
		printInfo(department);

	}
	
	
	public static void printInfo(Department[] departments) {
	    for (int i = 0; i < departments.length; i++) {
	        departments[i].printDepartmentInfo();
	        Teacher[] teachers = departments[i].getTeachers();
	        
	        System.out.println("teachers:");

	        for (int t = 0; t < departments[i].getNumberOfTeacher(); t++) {
	            if (teachers[t] != null) {
	                teachers[t].printTeacherInfo();
	            }
		        System.out.println("==========================");

	        }
	        
	    }
	}


}
