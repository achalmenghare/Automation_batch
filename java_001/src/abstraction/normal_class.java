package abstraction;

public class normal_class extends Abstraction {
	
	//instance method
	
	public void name() {
		System.out.println("run the code");

	}

	public static void main(String[] args) {
		normal_class mn = new normal_class();
		mn.data();
		mn.fletch();
		mn.name();
		mn.system();
		mn.testing();

	}

	
     // unimplemented method
	
	@Override
	public void testing() {
		System.out.println("execute the code1");
	}

	@Override
	public void data() {
		System.out.println("execute the code2");
	}

	@Override
	public void system() {
		System.out.println("execute the code3");
	}

}