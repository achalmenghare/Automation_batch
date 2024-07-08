package encapsulation;

public class Class_001 {

	private String username = "achal56@gmail.com";

	private void login(String m) {
		username = m;
		System.out.println(m);

	}

	public static void main(String[] args) {

		Class_001 mn = new Class_001();
		mn.login("achalmenghare");
		System.out.println(mn.username);
		
		
	}

}
