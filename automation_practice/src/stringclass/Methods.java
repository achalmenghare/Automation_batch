package stringclass;

public class Methods {

	public static void main(String[] args) {
		// contains
		String m = " automation";
		System.out.println(m.contains("manual"));
        System.out.println(m.contains("automation"));
		
        // equals
		String expected = "manual";
		String actual = "manual";
		System.out.println(expected.equals(actual));
		
		// length
		String a = "achal";
		System.out.println("the length of value of a is: " + a.length());

		// replace
		String h = "menghare";
		System.out.println(h.replaceFirst("menghare", "stp_infotech"));

		// index
		System.out.println(h.indexOf('g'));

		// substring
		System.out.println(h.substring(3));
		System.out.println(h.substring(3, 7));

		// charAt
		String s ="nagpur";
		String d = "wardha";
		System.out.println(d.charAt(3));
		System.out.println(d.charAt(5));

	    //concat
		System.out.println(d.concat( s));
	
	    //tolowercase
		System.out.println(d.toLowerCase());
	    
		//touppercase
		System.out.println(s.toUpperCase());
	
	    //Isempty
		String q ="";
	    System.out.println(s.isEmpty());
	    System.out.println(q.isEmpty());
	
	    //equalsignorecase
	    String expected1 = "software";
	    String actual1 = "software";
	    System.out.println(expected1.equalsIgnoreCase(actual1));
	    
	    //endswith
	    String e =  "  testing  ";
	    System.out.println(e);
	    System.out.println(e.endsWith("test"));
	
	    //trim
	    System.out.println(e.trim());
	
	
	}

}