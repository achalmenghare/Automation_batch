package patterns_of_nested_loop;

public class Zero_one {

	public static void main(String[] args) {
		//row - 5
		//col - 5
		
	for(int x = 1;x<=5;++x)	{
	for(int y = 1;y<=x;++y)	{
	int z = x+y;
	if(z%2==0) {
	System.out.print("1 ");	
		}else {
		System.out.print
		("0 ");	
			
		}
		
	}
	System.out.println();	
		
	}

	}

}
