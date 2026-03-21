package findSin;
import java.util.*;


public class Sin {

	public static void main(String[] args) {
		double x;
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("enter the angle in ridans: ");
		x=inputScanner.nextInt();
		double result=findSine(x);
		System.out.println("the sin of angle: " + x + " is: " + result);
		inputScanner.close();

	}
	
	/*public static double findSine(int x) {
		double sin=0,term=1;
		int pow=1,number=1;
		while(term>0.00001) {
			term=(Math.pow(x, pow))/factorial(pow);
			
			if(number%2!=0)
				sin+=term;
			else 
				sin-=term;
			
			pow+=2;
			number++;	
		}
		return sin;
	}*/
	
	
	
	public static double findSine(Double x) {
		double pow=0,sin=0,term=1;
		for(int i=1;term>=0.00001;i+=2) {
			term=Math.pow(x, i)/factorial(i);
			sin+=(term*Math.pow(-1, pow++));
		}
		return sin;
	}
	
	public static double factorial(int x) {
		double factorial=1;
		while(x!=0) {
			factorial*=x;
			x--;
		}
		return factorial;
	}

}
