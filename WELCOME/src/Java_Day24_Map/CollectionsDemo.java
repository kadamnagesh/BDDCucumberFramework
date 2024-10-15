package Java_Day24_Map;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList li = new ArrayList () ;
		
		li.add(1);
		li.add(3);
		li.add(2);
		
		System.out.println(li);
		
		// collection > interface             collections > class
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
	}

}
