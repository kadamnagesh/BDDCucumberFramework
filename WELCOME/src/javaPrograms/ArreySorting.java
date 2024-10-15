package javaPrograms;

public class ArreySorting {

	public static void main(String[] args) {
		

       int aa []= {6,7,4,1,2,3,5};
       
       System.out.println("array after sorting");
       
       for(int i=0; i<aa.length; i++)
       {
    	   for(int j=i+1; j<aa.length; j++)
    	   {
    		   int temp=0;
    		   if (aa[i]>aa[j])
    		   {
    			   temp=aa[i];
    			   aa[i]=aa[j];
    			   aa[j]=temp;
    		   }
    	   }
    	    System.out.print(aa[i]+" ");
       }
        System.out.println();
       }
		
			}


