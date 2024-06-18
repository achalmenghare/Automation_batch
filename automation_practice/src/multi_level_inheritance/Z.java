package multi_level_inheritance;

public class Z extends Y {
	int p = 56;

	public static void name() {
		System.out.println("manual");

	}

	public static void main(String[] args) {
		Z hj = new Z();
		System.out.println(hj.e);
		System.out.println(hj.p);
		hj.sub();
		hj.name();
		System.out.println(hj.u);
	}

}
