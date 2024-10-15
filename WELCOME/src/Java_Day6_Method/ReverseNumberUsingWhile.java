package Java_Day6_Method;

public class ReverseNumberUsingWhile {

	public static void main(String[] args) {
		
		// reverse the number 
		
	int input=123;
	int output=0;
	
	while (input>0) 
	{
	int reminder=input % 10; //3, 2,1,
	
	input=input/10; // 12,2,
	
	output=output*10+reminder;  //3, 32, 231
	}
	System.out.println(output);
	}

}