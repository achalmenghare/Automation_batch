package casting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {
		// system date and time

		Date m = new Date();
		System.out.println(m.toString());
		System.out.println("----------------------------");

		// customize date and time

		SimpleDateFormat n = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		System.out.println(n.format(m));
		System.out.println("---------------------------------");

		// date
		
		SimpleDateFormat o = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(o.format(m));
		System.out.println("-------------------------------------");

	    //time
		SimpleDateFormat p = new SimpleDateFormat("hh:mm:ss");
		System.out.println(p.format(m));
		
	
	
	}

}
