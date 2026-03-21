package person;

import java.util.*;



public class TestPerson {

	public static void main(String[] args) {
		
		Object[] arr=new Object[3];
		
		arr[0]=new Student("mohammed" ,1241124);
        arr[1]=new Person("ali");
        arr[2]=new Worker("samer" ,1990.67); 
        
        for(int i=0;i<3;i++) {
        	printVals(arr[i]);
        }
        
        
	}
	
	public static void printVals(Object ob) {
      System.out.println(ob.toString());
	}

}
