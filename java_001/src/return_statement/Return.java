package return_statement;

public class Return {

	// 1. without return type and no parameter

	public void test() {
		System.out.println("automation");
		System.out.println("manual");
	}

	public static void group() {
		System.out.println("ram");
		System.out.println("sham");
		
	}

	// 2. withuot return type and with parameter

	public void abc(String city) {
		System.out.println("the value of city is: " + "city");
	}

	public static void age(int a) {
		System.out.println("the value of a is: " + a);
		
	}

	// 3. with return statement and parameters

	public void std(int n) {
		System.out.println("the value of n is:" + n);
		return;
	}

	public static void system(String ab) {
		System.out.println("the value of ab is:" + ab);
		return;
	}
	
	// 4. with return type and having parameters

	public int subtraction(int f, int g) {
		return f - g;
	}

	public static int division(int j, int r) {
		return j / r;
	}

	public static void main(String[] args) {
		Return x = new Return();
		x.test();
		group();
		x.abc("wardha");
		age(45);
		x.std(45);
		system("name");
		System.out.println(x.subtraction(500, 250));
		System.out.println(x.division(25, 5));

	}
}
