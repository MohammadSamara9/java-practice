//mohammed samara
//1241124
//Basim sayrafi
//sec4,lab7


package salarycalculation;
import java.util.Scanner;


public class Solution {
	
	static Scanner inputScanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		// determine the number of employees then create the array
		System.out.println("Enter the number of employee");
		int size=inputScanner.nextInt();
		if(size==0) {
			System.out.println("No employee found");
			return ;
		}
		double[][] employees=new double[size][5];
		
		
		//call methods
		readData(employees);
		calcSalary(employees);
		calcTax(employees);
		printStats(employees);
		
		
		
		

	}
	
	
	// read the number of hours worked and hourly rate for employees one after one
	public static void readData(double[][] arr ) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number of hours worked for employee number" + (i+1) + ":");
			arr[i][0]=inputScanner.nextDouble();
			
			System.out.println("Enter the hourly rate for employee number" + (i+1) + ":");
			arr[i][1]=inputScanner.nextDouble();
			
		}
		
		
	}
	
	
	
	
	 //calculate  gross Salary for each employee
	public static void  calcSalary(double[][] arr ) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i][2]=arr[i][0]*arr[i][1];
		}
		
	}
	
	
	
	
	
	// calculate the tax then calculate the net salary
	public static void  calcTax(double[][] arr ) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i][2]<=300) {
				arr[i][3]=arr[i][2]*0.03;
				arr[i][4]=arr[i][2]-arr[i][3];
			}
				
			else if(arr[i][2]>300 && arr[i][2]<=1000) {
				arr[i][3]=arr[i][2]*0.16;
				arr[i][4]=arr[i][2]-arr[i][3];
			}
				
			else if(arr[i][2]>1000) {
				arr[i][3]=arr[i][2]*0.20;
				arr[i][4]=arr[i][2]-arr[i][3];
			}
				
	
		}
	}
	
	
	
	//display each employee’s information
	public static void   printStats(double[][] arr ) {
		double averageGrossSalary;
		double sumOfGrossSalary=0;
		double averageNetSalary;
		double sumOfNetSalary=0;
		double totalTaxCollected=0;
		System.out.println("                        EMPLOYEES INFORMATION                   ");
		System.out.println("EMPLOYEE NUMBER      GROSS SALARY      NET SALARY        TAX    ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%-22d%-18.3f%-16.3f%-9.3f\n",(i+1),arr[i][2],arr[i][4],arr[i][3]);
			sumOfGrossSalary+=arr[i][2];
			sumOfNetSalary+=arr[i][4];
			totalTaxCollected+=arr[i][3];
		}
		averageGrossSalary=sumOfGrossSalary/arr.length;
		averageNetSalary=sumOfNetSalary/arr.length;
		System.out.printf("\n\nThe average of gross salary: %.3f",averageGrossSalary);
		System.out.printf("\nThe average of net salary: %.3f",averageNetSalary);
		System.out.printf("\n The total tax collected for all employees: %.3f",totalTaxCollected);
		
		
	}
	

}
