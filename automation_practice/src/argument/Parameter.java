package argument;

public class Parameter {
	// instance variable
		int a;
	    float n;
	    // static variable
	    static int s;
		public void stud(int d,int f) {
			a = d;
			s = f;
			System.out.println("the value of a is:"+a);
			System.out.println("the value of s is:"+s);
			
			}
		public void std(float m ) {   
			n = m;
			System.out.println("the value of n is :"+n);
		} 
		
		
		
		public static void main(String[] args) {
		Parameter ab = new Parameter( );
		ab.stud(200,562);
		ab.std(25.5f);	
		
		}
		
		

	
	
	
}
