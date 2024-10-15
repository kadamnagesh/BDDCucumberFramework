package Java_Day24_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		
		Map map = new HashMap();

		map.put(1, 10);
		map.put(3, 21);
		map.put("name", "test");
		map.put(3, 55);
		map.put(4, 55);
		map.put(null, 1);   // map accept unique null key
		map.put(6, null); 	// map accept multiple null values
		map.put(7, null);
		System.out.println(map);

		// map.clear();

		System.out.println(map.containsKey(1));           //     to cheack key is present or not
		System.out.println(map.containsValue(22));        //     to check value is present or not
		System.out.println(map.get(1));                  //      to write key and get value
		System.out.println(map.get("name"));             //  to write value and get key
		// map.isEmpty()
		Set key=map.keySet();
		System.out.println(map.keySet());         // to get set of key
      	Collection c=	map.values();
		System.out.println(c);                     //  to get set of value

		System.out.println(map.size());          // to get size of map
		map.remove(1);
		System.out.println(map);
		map.replace(3, 77);
		System.out.println(map);
		map.putIfAbsent(3, 88);
		System.out.println(map);
		
	}
  }
