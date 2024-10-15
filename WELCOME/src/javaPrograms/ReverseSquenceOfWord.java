
package javaPrograms;

public class ReverseSquenceOfWord {

 public	static void main(String[] args) {

	 String input = "my name is ram";
	    
	    String output="";
	    
	    String [] arr = input.split(" ");
	    
	    for (int i=(arr.length-1); i>=0; i--)
	    	
	    {
         
	    	output=output+arr[i]+" ";       //  ram,      ram is,        ram is my,      ram is my name
	    	
	    }
	    System.out.println(output);

      }
}