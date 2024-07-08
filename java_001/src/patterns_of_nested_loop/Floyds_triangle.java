package patterns_of_nested_loop;

public class Floyds_triangle {

	public static void main(String[] args) {
		//row - 5
		//col - 5
		int p = 1;
		for( int k = 1;k<=5;++k) {
		for( int j = 1;j<=k;++j)	{
		System.out.print(p+" ");
		++p	;
			
		}	
		System.out.println();	
			
		}
			
			
		}	
	
}
