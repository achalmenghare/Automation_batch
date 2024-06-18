package patterns_of_nested_loop;

public class Solid_rectangle {

	public static void main(String[] args) {

		// solid rectangle
		// row - 5
		// col - 6

		for (int x = 1; x <= 5; ++x) {
			for (int y = 1; y <= 6; ++y) {
				System.out.print("* ");

			}
			System.out.println();
		}

		
		
		
		for (int a = 1; a <= 9; ++a) {
			for (int b = 1; b <= 10; ++b) {
				System.out.print("* ");
			}
            System.out.println();
		}
	}
}
