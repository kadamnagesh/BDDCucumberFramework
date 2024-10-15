package Java_Day15_String2;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		String s="abc";
		
		System.out.println(s.concat("xyz"));
		
		System.out.println(s);
		
		String x=new String("pqr"); // Immutable class for string
		
		StringBuilder sb=new StringBuilder("pqr");  // mutable class for string
		
		x.concat("lmn");
		
		sb.append("lmn");
		
		System.out.println(x);
		
		System.out.println(sb);
		
	}

 }
