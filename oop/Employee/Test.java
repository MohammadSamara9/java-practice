package employee;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
     Employeee[] employees=new Employeee[4];
     employees[0]=new Employeee(4,"mohammed",145,new Date(70,11,3),new Date(80,1,12),1200);
     employees[1]=new Employeee(7,"ali",122,new Date(67,12,3),new Date(80,1,12),1200);
     employees[2]=new Employeee(9,"samer",192,new Date(90,10,2),new Date(80,1,12),1200);
     employees[3]=new Employeee(2,"issa",102,new Date(34,9,3),new Date(80,1,12),1200);
     
     largeSalary(employees).printInfo();
     

	}
	
	
   public static Employeee largeSalary(Employeee[] employees) {
	   Employeee max=employees[0];
	   for(int i=0;i<employees.length;i++) {
		   if(employees[i].getBasicSalaray()>max.getBasicSalaray())
			   max=employees[i];
	   }
	   return max;
   }


}
