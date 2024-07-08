package variables;

public class Static_variables {

	//static variable
	static int a = 90;
	static float l = 85.63f;
	static int o = 78;
	
	// instance method
	public void fun() {
	System.out.println(a);	
	System.out.println(l);	
	System.out.println(o);
	}
	
	//static method
	public static void jump() {
	System.out.println(a);	
	System.out.println(l);	
	System.out.println(o);	
	}
	
	public static void main(String[] args) {
	Static_variables mn = new Static_variables();	
	System.out.println(mn.a);
	// or we can access with the help of classname 
	System.out.println(Static_variables.l);
	mn.fun();
	jump();
	}
	
}
