package methods;

public class Instance_method {
	// instance method

	public void login() {
		int a = 45;
		System.out.println(a);
		byte m = 26;
		System.out.println(m);
	}

	public void function() {
		float j = 23.56f;
		System.out.println(j);
		double o = 452.65;
		System.out.println(o);
	}

	public void non_numeric() {
		short q = 89;
		System.out.println(q);
		long v = 100;
		System.out.println(v);
        char s = 'u';
	    System.out.println(s);
	    int e = 50;
	    boolean l = e <=50;
	    System.out.println(l);
	
	}
	public void number() {
		int y = 45;
		System.out.println(y);
		
	}
	
	public void name() {
		String p = "manual";
		System.out.println(p);
	}
	public void data() {
		int y = 500;
		System.out.println(y);
	}

	public static void main(String[] args) {
		// to access in main method create object

		Instance_method xy = new Instance_method();
		xy.login();
		xy.function();
		xy.non_numeric();
	    xy.number();
	    xy.name();
	    xy.data();
	}

}
