package variables;

public class Instance_variables {
    //instance variable
	int a = 75;
	String m = "achal";
	int k = 89;
	
    // instance method
	public void add() {
	System.out.println("the first value is: "+a);	
	System.out.println("the second value is: "+m);	
	System.out.println(k);
	}
	
	//static method
	public static void sum() {
	Instance_variables mn = new Instance_variables();
	System.out.println("the third value is: "+ mn.a);	
	System.out.println("the fourth value is: " +mn.m);	
		
	}
	
	
	
	public static void main(String[] args) {
	Instance_variables max = new Instance_variables();	
    System.out.println("the fifth value is: "+ max.a);
	System.out.println("the sixth value is: "+ max.m);
    max.add();
	sum();
	
	}

}
