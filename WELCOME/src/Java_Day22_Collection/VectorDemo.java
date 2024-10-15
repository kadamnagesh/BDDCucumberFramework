package Java_Day22_Collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
            Vector v = new Vector();
		
		        v.add(1);
		        v.add('h');
		        v.add("name");
		        v.add(false);
		        
            System.out.println(v);
            
          System.out.println( v.indexOf(1)); // to find the index of elment
          
          System.out.println(v.get(3));  // find the elment
          
	}

}
