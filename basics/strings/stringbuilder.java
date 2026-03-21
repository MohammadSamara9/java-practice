package stringbuilder;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder ss=new StringBuilder("Welcome");
		ss.append("to java");
		ss.insert(14, "and html");
		ss.delete(20, 25);
		ss.setCharAt(0, 'w');
		ss.reverse();
		System.out.println("the text is : " + ss + " and size = " +ss.length() + " and capacity: " + ss.capacity());
		

	}

}
