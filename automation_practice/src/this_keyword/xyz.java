package this_keyword;

public class xyz extends abc {

	int y = 75;
	String h = "stp";
	float m = 56.5f;

	public void fun() {
		
		
		System.out.println(this.h);
		System.out.println(this.m);
		System.out.println(this.y);
		System.out.println("show the value");

	}

	

	public static void main(String[] args) {
		
		
		xyz op = new xyz ();
        op.fun();
	}

}
