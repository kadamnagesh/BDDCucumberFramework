package Java_Day23_Set;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {

	public static void main(String[] args) {
		

		List ll=new LinkedList();
		
		LinkedList lk=new LinkedList();
		ll.add(1);
		ll.add('b');
		ll.add("string");
		ll.add(6);
		ll.add(1);
		System.out.println(ll);
		System.out.println(ll.size());
	
		
		// iterator
		
		Iterator itr=ll.iterator();
		while (itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
	}

	
}
