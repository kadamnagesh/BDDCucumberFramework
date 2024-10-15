package Java_Day23_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesOfSet {

	public static void main(String[] args) {
		
		Set hs=new HashSet();
		
		// insetion order do not maintain
		
		Set ls = new LinkedHashSet();
		
		// insertion order maintain
		
		Set ts = new TreeSet();
		
		ts.add(3);
		ts.add(1);
		
		System.out.println(ts);
		
		// maintain the element in sorting way
	}

}
