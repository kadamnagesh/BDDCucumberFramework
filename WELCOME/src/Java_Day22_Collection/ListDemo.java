package Java_Day22_Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args)
	   {
         // List li=new List(); can not create object of List interface directly

		List al = new ArrayList(); // parent pc=new Parent
		ArrayList ali = new ArrayList(); // child c=new child();

		System.out.println(al);

		al.add(1);                                        // to add element in List
		al.add('c');
		al.add(true);
		al.add("name");
		System.out.println(al);
		System.out.println(al.get(3));                 // read element from the index

		System.out.println(al.size());            // number of elements in List
		System.out.println(al.isEmpty());            // check list is empty or not
		
//		al.clear();						          // Clear the list
//		System.out.println(al);
		
		System.out.println(al.contains(2));  // check the given object is present or not in list
		
		al.add(0, "mantri");
		System.out.println(al);
		
		ali.add(3);
		ali.add(5);
		
		al.addAll(ali);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		al.remove(true);
		System.out.println(al);
		
		System.out.println(al.indexOf("name"));
		
		//al.lastIndexOf(ali)
		
		al.set(0, 2);
		System.out.println(al);
		al.add("name");
		System.out.println(al);


	}
	

}
