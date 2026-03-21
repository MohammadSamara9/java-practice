package sineSeriesExpansion;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("ENTER THE ANGLE in  RADIANS");
		double x =inputScanner.nextDouble();
		double sin=sin(x);
		System.out.println(sin);

	}
	
	public static double sin(double x) {
		double term=1,sin=0,power=0;
		for(int i=1;term>=0.00001;i+=2) {
			term=Math.pow(x, i)/factorial(i);
			sin+=(term*Math.pow(-1, power++));
			
		}
		return sin;
	}
	
	public static int factorial(int n) {
		int fac=1;
		
		while(n!=0) {
			fac*=n--;
		}
		return fac;
	}
	

}
