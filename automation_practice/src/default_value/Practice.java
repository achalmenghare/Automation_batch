package default_value;

public class Practice {
  
	int a ;
	byte b;
	short c;
	long d ;
	float e;
	double f;
	char g;
	boolean h;
  
	
	String i;
	
	public static void main(String[] args) {
		Practice xy = new Practice();
	//primitive datatype	
	//integer datatype
		
	System.out.println("the default value of int is: "+xy.a);
	System.out.println("the default value of byte is: "+xy.b);
	System.out.println("the default value of short is: "+xy.c);
	System.out.println("the default value of long is: "+xy.d);
	
	//floating
	
	System.out.println("the default value of float is: "+xy.e);
	System.out.println("the default value of double is: "+xy.f);
	
	//non numeric
	System.out.println("the default value of char is: "+xy.g);
	System.out.println("the default value of boolean is: "+xy.h);
	
	//non primitive datatype
	System.out.println("the default value of string is: "+xy.i);
	
	
	
	
	
	}

}