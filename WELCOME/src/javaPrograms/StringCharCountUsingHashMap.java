package javaPrograms;

import java.util.HashMap;

public class StringCharCountUsingHashMap {

	public static void main(String[] args) {
		
		String str1 = "This this is is is done by Kaushal Kaushal";
		
		String str2 = str1.toLowerCase();
		
		String arr [] = str2.split(" ");
		
		HashMap <String,Integer> map = new HashMap<>();
		
		for(String word : arr) 
		{
			if(map.containsKey(word)) 
			{
				map.put(word, (map.get(word)+1));
			}
			else 
			{
				map.put(word, 1);
			}
		}
            System.out.println(map);
	}

}
