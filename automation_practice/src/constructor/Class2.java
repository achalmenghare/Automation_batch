package constructor;

public class Class2 {

	public Class2(int a) {
		this();
		
		System.out.println("constructor 1");

	}

	public Class2(int b, long c) {
		this(60.56f);
		System.out.println("constructor 2");

	}

	public Class2(String d) {
		this(23,56);
		System.out.println("constructor 3");

	}

	public Class2(float e) {
		this(25);
		System.out.println("constructor 4");

	}
	
	public Class2() {
	System.out.println("user defined constructor");	
		
	}
	
	
	public static void main(String[] args) {
		Class2 ab = new Class2("automation");

	}

}
