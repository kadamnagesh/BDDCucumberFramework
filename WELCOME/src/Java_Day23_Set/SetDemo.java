package Java_Day23_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
         Set hs = new HashSet();
		
		System.out.println(hs);
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(1); // duplicate are not allowed 
		
		System.out.println(hs);
		for (Object x:hs) 
		{
		System.out.println(x);	
		}
		System.out.println("-------------");
		
		Iterator itr=hs.iterator();
		while (itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}

}
