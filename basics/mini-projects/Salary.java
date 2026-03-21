package salaray;
import java.util.Scanner;

public class Salary {
       public static void salary() {
    	   int hours;
    	   double salary;
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("HI ENTER HOURS WORK");
    	   hours=input.nextInt();
    	   salary= calculateSakary(hours);
    	   System.out.println(salary);
    	   input.close();
 
       }
	 public static double calculateSakary(int hours) {
		 double salary=0;
		  
		 if(hours>8) {
			 salary=(8*10)+((hours-8)*15);
			 
		 }else if(hours<=8) {
			 salary=hours*10;
		 }
		 
		 return salary;
		 
		 
	 }

}
