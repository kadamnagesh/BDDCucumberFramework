package Java_Day24_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountString {

	public static void main(String[] args) {

			// input = testers t=2,e,2,s=2,r=1
     String input="testers";
     Map <Character,Integer>map=new LinkedHashMap<>();
     for (int i=0; i<input.length(); i++) {
    	 char c=input.charAt(i);
    	 
    	 if(map.containsKey(c)) {
    		 map.put(c, (map.get(c)+1));
    	 }
    	 else {
    		 map.put(c, 1); //{t=2, e=2,s=2,r=1 }
    	 }
     }
     System.out.println(map);
	}
    }
