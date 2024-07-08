package exception;

public class Try_catch_block {

	public static void main(String[] args) throws InterruptedException {
		
		try {
		Thread.sleep(5200);	
		}catch(InterruptedException h) {
		h.printStackTrace();	
			
		}catch(Exception m) {
		m.printStackTrace();	
		}
		finally {
		System.out.println("exception handled");	
			
		}
		
	
	
	
	}
	
	
	

}
