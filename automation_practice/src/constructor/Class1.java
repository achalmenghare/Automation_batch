package constructor;

public class Class1 {

	public Class1() {
	System.out.println("user defined constructor");	
		
		
		
	}
	public Class1(int a ,float b) {
		System.out.println("parameterized constructor");	
			
			
			
		}
		
	
	
	
	public static void main(String[] args) {
		Class1 n = new Class1();	
		Class1 a = new Class1(23,45.63f);
		
		
	}

}
