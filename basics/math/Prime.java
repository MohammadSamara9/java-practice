package primenumbers;
import java.util.Scanner;
public class Prime {
        public static void main(String[] args) {
        	boolean result=false;
        	Scanner input=new Scanner(System.in);
        	System.out.println("ENTER THE NUMBER");
        	int x=input.nextInt();
        	result=isPrime(x);
        	input.close();
        	if(result==true)
        		System.out.println("IS PRIME");
        	else {
				System.out.print("NOT PRIME");
			}
        	
        	
        }
        
        public static boolean isPrime(int number) {
        	
        	for(int i=2;i<number-1;i++) {
        		if(number%i==0)
        			return false;
				
        	}
        	return true;
        
        }}
