package cities;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		City[] cities=new City[4];
		
		for(int i=0;i<cities.length;i++) {
			System.out.println("enter the information for city " + (i+1)+ ": ");
			System.out.println("Name,Longitude,Latitude,temperature");
			String var1=inputScanner.next();
			double var2=inputScanner.nextDouble();
			double var3=inputScanner.nextDouble();
			int var4=inputScanner.nextInt();
			cities[i]=new City(var1,var2,var3,var4);
		}
		
		belowAverage(cities, 23);
		

	}
	
	public static void belowAverage(City[] arr,int temperature) {
		int sum=0;
		double average=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].getTemperature();
			
		}
		
		average=(double)sum/arr.length;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getTemperature()<average)
				System.out.println(arr[i].printCityInfo());
				
		}
		
		
	}

}



