package series;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	        	
	        	
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            double term=0.0;
	            
	            
	            
	            for(int j=0;j<=n;j++) {
	            	term+=a + Math.pow(2, j)*b;
	            	System.out.print(term);
	            }	
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        in.close();

	}

}
