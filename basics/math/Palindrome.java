package pilindrome;
import java.security.Identity;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.print("enter the number ");
		int number=inputScanner.nextInt(); 
		if(isPalindrome(number)==true)
			System.out.print("is palindrome");
		else if(isPalindrome(number)==false) {
			System.out.print("isn't palindrome");
		}

		
		
		
	}
	public static boolean isPalindrome(int number) {
		if(reverse(number)==number)
			return true;
		
		else 
			return false;
		
		
			
		
	}
	
	
	
	public static int reverse(int number) {
		int reversed=0;
		while(number!=0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		return reversed;
	}

}
