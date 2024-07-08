package patterns_of_nested_loop;

public class Half_pyramid_180 {
	public static void main(String[] args) {
		// half_pyramid_180
		// row - 4
		// col - 4

		for (int a = 1; a <= 4; ++a) {
			for (int b = 1; b <= 4-a; ++b) {
				System.out.print("  ");

			}
			for (int c = 1; c <= a; ++c) {
				System.out.print("* ");
			}
			System.out.println();
		}

	
//		for (int x = 1; x <= 6; ++x) {
//			for (int y = 1; y <= 6-x; ++y) {
//				System.out.print("  ");
//
//			}
//			for (int z = 1; z <= z; ++z) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	
	
	}
	
	
	
}
