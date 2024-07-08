package operator;

public class Logical_ope {

	public static void main(String[] args) {

		int m = 52;
		int n = 63;
		
		//logical and- &&
		System.out.println(m < n && m != n);
		System.out.println(m == n && m < n);
		System.out.println(m < 70 && m > 50);
		
		//logical or- ||
		System.out.println(m != n || n < 70);
		System.out.println(m < n || m > n);
		System.out.println(m == n || m > 60);

		//logical not- !
		System.out.println(!(m == n));
		System.out.println(!(n < 100));
		System.out.println(!(m > 50));
	}

}
