package execptionAndFiles;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println(bin2Dec("101"));
			
		} catch (NumberFormatException e) {
			System.out.println("invalid");
		}

	}
	
	public static int bin2Dec(String s){
		
		int decimal=0;
		int power=0;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char c=s.charAt(i);
			
			if(c!='1'&&c!='0') {
				throw new NumberFormatException();
			}
			
			if(c=='1') {
				decimal+=(int)Math.pow(2, power);
			}
			
			power++;
				
		}
		
		
		return decimal;
		
	}

}
