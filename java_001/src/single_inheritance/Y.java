package single_inheritance;

public class Y extends X {

	int j = 45;
	
	public void num () {
	System.out.println("fifty");	
		
	}
	
	public static void main(String[] args) {
	Y ab = new Y();
	System.out.println(ab.j);
	System.out.println(ab.k);
	ab.max();	
	ab.num();	
	}

}
