package Interviewasking;

public class SwapString {

	public static void main(String[] args) {
		
		// with using third varible
		
		String s1="nagesh";
		String s2="kadam";
		String temp="";
		System.out.println("---------------------------");
		
		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println("after swapping= "  +s1);
        System.out.println("after swapping= "  +s2);		
        
        
        
       // without using two string
        
      //  s1=s1.concat(s2);
        
        String s3="nagesh";
        String s4="kadam";
        
        s3=s3+s4;
        s4=s3.substring(0, 6);
        s3=s3.substring(6, 11);
        
//        s4 = s3.substring(0,s3.length()-s4.length());
//        
//        s3 = s3.substring(s4.length());
//        
//        System.out.println("-----------------------");
        
        System.out.println(s3);
        System.out.println(s4);

	}

}
