package shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Shape> list= new ArrayList<Shape>();
		
		list.add(new Circle("black",true,3.6));
		list.add(new Rectangle("red",true,3.6,4.2));
		list.add(new Circle("brown",false,2.2));
		list.add(new Rectangle("yellow",true,1.4,2.2));
		
		
		Collections.sort(list);
		
		for(Shape e : list) System.out.println(e + "  area: " + e.getArea());
		
		
		}
	


}
