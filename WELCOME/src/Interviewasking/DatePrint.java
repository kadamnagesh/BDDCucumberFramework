
package Interviewasking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		Date date=new Date();
	    System.out.println(sdf.format(date));
	    System.out.println(sd.format(date));
		System.out.println(date);
	}

}
