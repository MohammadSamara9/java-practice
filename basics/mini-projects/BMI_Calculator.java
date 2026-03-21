package com.fggh.course;
import java.util.Scanner;


public class BMI_Calculator {
	
	public static double cmToInches(double height) {
		return height * 0.39;
	}
	
	public static double kgToPounds(double weight) {
		return weight*2.2;
	}

	public static void main(String[] args) {
		
		double height,weight,heightInInches,weightInPounds,BMI;
		Scanner input =new Scanner(System.in);
		
		
		
		System.out.println("ENTER YOUR HEIGHT IN CM  THE YOUR WEIGHT IN KG ");
		
		height=input.nextDouble();
		weight=input.nextDouble();
		
		
		heightInInches=cmToInches(height);
		weightInPounds=kgToPounds(weight);
		
		BMI =(weightInPounds * 703)/(heightInInches * heightInInches );
		
		
		if(BMI>=15 && BMI<19) {
			System.out.println("Underweight");
		}else if(BMI>=19 && BMI<25) {
			System.out.println("Normal");	
		}else if(BMI>=25 && BMI<30) {
			System.out.println("Overweight");	
		}
		
	}
	
	
	

}
