package Java_Day15_String2;

  public class StringMethods {

	public static void main(String[] args) {
		
		String s=" my name ";
		System.out.println(s);
		System.out.println(s.trim());   // remove starting and ending spaces
		
		String output="";
		char arr[]=(s.trim()).toCharArray();  // convert string into character array
		for(int i=(arr.length-1);i>=0;i--)
		{
			output=output+arr[i];
		}
		System.out.println(output);

		String fullName="raj sagar patil";
		
		String[] sarray=fullName.split(" ");      // allocate the index to word
		System.out.println(sarray[1]);
		System.out.println(sarray[2]+" "+sarray[0]+" "+sarray[1]);
		
		System.out.println(s.indexOf('m'));  // to give first index of char
		System.out.println(s.lastIndexOf('m'));  // to give the last index of char
		
		String test="aabrccddee";
		System.out.println(test.substring(3)); 
		
		System.out.println(test.substring(1, 5));
	}

}
