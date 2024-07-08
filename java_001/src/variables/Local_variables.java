package variables;

public class Local_variables {

	// instance method
	public void sky() {
		String h = "stp";
		System.out.println(h);
        long j  = 100;
        System.out.println(j);
	}

	// static method
	public static void num() {
		int p = 56;
		System.out.println(p);
        char t = 'o';
        System.out.println(t);
	}

	public static void main(String[] args) {
		int b = 25;
		System.out.println(b);
		int y = 54;
		System.out.println(y);
		Local_variables r = new Local_variables();
		r.sky();
		num();
	}

}
