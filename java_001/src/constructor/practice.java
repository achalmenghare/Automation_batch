package constructor;

public class practice {

	
		public practice() {
			System.out.println("user defined");
			
			
		}
	
       public practice(int d,long l) {
    	   this();
    	  System.out.println("parameterised"); 
    	   
    	   
       }
       public practice(String n) {
    	   this(21,56);
    	   System.out.println("parameterised1");
    	   
    	   
       }
       public static void main(String[] args) {
   		
   		
   	
       practice pl = new practice("manual");
}
}
