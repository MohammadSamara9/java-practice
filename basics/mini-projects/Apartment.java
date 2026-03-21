package building;
import java.util.Scanner;
public class Apartment {

	public static void main(String[] args) {
		int size =0;
		int numberOfPeople=0;
		double avarageOfPeople=0;
		int aboveAvarage=0;
		int underAvarage=0;
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF APARTMENT");
		size=inputScanner.nextInt();
	    int[] building=new int[size];
	    System.out.println("ENTER THE NUMBER OF PEOPLE IN EACH APARTMENT");
	    for(int i=0;i<building.length;i++) {
	    	building[i]=inputScanner.nextInt();
	    }
	    
	    for(int i=0;i<building.length;i++) {
	    	numberOfPeople+=building[i];
	    	avarageOfPeople=(double) numberOfPeople/building.length;
	    
	    	if(building[i]>avarageOfPeople)
	    		aboveAvarage++;
	    	else if(building[i]<avarageOfPeople)
	    		underAvarage++;
	    	
	    	
	    }
		System.out.println("THE NUMBER OF PEOPLE IN BUILDING IS " +numberOfPeople);
    	System.out.println("THE AVARAGE OF PEOPLE IS " +avarageOfPeople);
	    System.out.println("NUMBER OF APARTMENT ABOVE THE AVARAGE IS " +aboveAvarage);
	    System.out.println("NUMBER OF APARTMENT UNDER THE AVARAGE IS " +underAvarage);
	    inputScanner.close();
	    
	  

	}

}
