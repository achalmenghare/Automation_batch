package polymorphism;

public class Overloading {

	public void student() {
		System.out.println("block method with parameter");
	}

	public void student(int k) {
		System.out.println("block method with int parameter");
	}

	public void student(int a, long n) {
		System.out.println("block method with int and long parameter");
	}

	public void student(String m) {
		System.out.println("block method with string parameter");
	}

	public static void main(String[] args) {
		Overloading ab = new Overloading(); 
	ab.student();
	ab.student(0);
	ab.student(25, 452);
	ab.student("automation");
	}
}