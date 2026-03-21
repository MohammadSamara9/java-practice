package operations;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		
		System.out.println("enter the size of array:");
		int[] array =new int[inputScanner.nextInt()];
		
		System.out.println("enter the numbers in array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=inputScanner.nextInt();
		}
		
		
		MyArray numArray=new MyArray(array);
		
		numArray.printArray();
		System.out.println("The size of array: " + numArray.getSize());
		System.out.println("The avg of array: " + numArray.avarage());
		System.out.println("The min of array: "+ numArray.min());
		System.out.println("the max of array: "+numArray.max());


	}

}
