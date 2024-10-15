package Interviewasking;

import java.util.*;

class PracticeProgram {
	
	public static void main(String[] args) {
		
       String input = "wqx23*&^%hbsh&*)";
       
       String alldig = "";
       String allalp = "";
       String allspe = "";
       
       int dig = 0;
       int alp = 0;
       int spe = 0;
       
       for(int i=0; i<input.length(); i++)
       {
    	   char c = input.charAt(i);
    	   
    	   if(Character.isAlphabetic(c))
    	   {
    		   allalp = allalp + c;
    		   alp = alp + 1;
    	   }
    	   else if(Character.isDigit(c))
    	   {
    		   alldig = alldig + c;
    		   dig = dig + 1; 
    	   }
    	   else
    	   {
    		   allspe = allspe + c;
    		   spe = spe + 1;
    	   }
       }
       
       System.out.println(alldig +"    "+dig);
       System.out.println(allalp +"    "+alp);
       System.out.println(allspe +"    "+spe);
	}
}
