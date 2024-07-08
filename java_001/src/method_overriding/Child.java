package method_overriding;

public class Child extends Parent {

	public void group() {
		System.out.println("group method from child class");
	}

	public static void testing() {
		System.out.println("static method from parent class");
	}

	public static void main(String[] args) {
		Child m = new Child();
		m.testing();

		Parent k = new Child();
		k.group();

		Parent l = new Parent();
		l.group();

	}

}
