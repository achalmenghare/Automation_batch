package super_keyword;

public class B extends A {

	int u = 412;

	long l = 456;

	public void xyz() {
		System.out.println(super.l);
		System.out.println(super.u);
		System.out.println(this.l);
		System.out.println(this.l);
		super.xyz();
		super.abc();
		this.abc();
		
		System.out.println("print the value1");

	}

	public static void abc() {
		
		System.out.println("show the value1");
	}
	
	public B() {
		super(50);
	System.out.println("user defined  constructor");	
		
		
	}
	
	
	

	public static void main(String[] args) {
    B gh  = new B ();
	gh.xyz();
	
	
	}

}
