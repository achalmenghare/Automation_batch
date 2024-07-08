package methods;

public class Static_method {

	// static method

	public static void payment() {
		float t = 78.96f;
		System.out.println(t);
		long d = 255;
		System.out.println(d);
		int i = 633;
		System.out.println(i);

	}

	public static void type() {
		int g = 56;
		System.out.println(g);
		int h = 78;
		System.out.println(h);
		long r = 63;
		System.out.println(r);

	}

	public static void game() {
		int h = 45;
		System.out.println(h);

	}

	public static void fun() {
		float j = 45.63f;
		System.out.println(j);
	}
	public static void data() {
		int o = 8966;
		System.out.println(o);
		
		
	}

	public static void main(String[] args) {

		// first way to accsess
		payment();
		// second way to access
		Static_method.type();
		game();
		fun();
		data();
	}

}
