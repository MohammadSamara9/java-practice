package linearSearch;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		int[] arr= {4,9,5,3,1};
		System.out.println("enter the number");
		int number=inputScanner.nextInt();
		int result=findNumber(arr, number);
		if(result!=-1)
			System.out.println("the number is exists and his index is: " + result);
		else if(result==-1)
			System.out.println("not found");
		inputScanner.close();
	}
	
	public static int findNumber(int[] arr ,int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number)
				return i;
		}
		return -1;
	}
		

}
	
	
