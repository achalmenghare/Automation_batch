package hierarchical_inheritance;

public class Z extends X {

	int r= 56;
	
	public void max() {
	System.out.println("abc");	
		
		
	}
	public static void main(String[] args) {
		Z rt = new Z ();
		System.out.println(rt.y);
		System.out.println(rt.r);
	    rt.max();
	
	}

}
