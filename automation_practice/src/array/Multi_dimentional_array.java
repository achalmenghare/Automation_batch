package array;

public class Multi_dimentional_array {

	public static void main(String[] args) {
		// by allocating memory
		// here we use nested loop

		int[][] testing = new int[3][4];
		testing[0][0] = 1;
		testing[0][1] = 2;
		testing[0][2] = 3;
		testing[0][3] = 4;

		testing[1][0] = 5;
		testing[1][1] = 6;
		testing[1][2] = 7;
		testing[1][3] = 8;

		testing[2][0] = 9;
		testing[2][1] = 10;
		testing[2][2] = 11;
		testing[2][3] = 12;

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 4; b++) {

				System.out.print(testing[a][b] + "   ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

	  //without allocating memory
	 
		int [][] sr_no = {{1,3,4},{2,3,4}};
	

		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 3; b++) {

				System.out.print(sr_no[a][b] + "   ");
			}
	        System.out.println();
	}

}
}
