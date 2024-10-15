package Java_Day10_Arrey;

public class ArreyDemo {

	public static void main(String[] args) {
		
        int a=10;  // decalre single elememt
		
		int b[] =new int[6];  // declaration of array
		
		b[0]=1;   // assign value to array index
		b[1]=2;
		b[2]=3;
		b[3]=4;
		
		// b[4]=false;   // ->   array only store same type of data which is declared
		
		int x=b[3];
		System.out.println(x);
		
		System.out.println(b[5]);   // when we do not have any value for array index, then Java put the default value of datatype

		boolean[] flag=new boolean[2];
		
		System.out.println(flag[1]);
		
		
		flag[0]=true;
		flag[1]=false;

		//dataType[] arrayName =new dataType[size]
		
	}

}
