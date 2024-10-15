package Java_Day22_Collection;

import java.util.ArrayList;

public class PrintArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList ();
		al.add(1);
		al.add('p');
		al.add(false);
		al.add("hello");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			Object o=al.get(i);
			System.out.println(o);
		}

		System.out.println("-----------------------");
		
		for(Object obj:al) {
			System.out.println(obj);
		}
		
	}

}
