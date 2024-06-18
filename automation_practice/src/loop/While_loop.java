package loop;

public class While_loop {

	public static void main(String[] args) {

		// 63 to 80
		int s = 63;
		while (s <= 80) {
			System.out.print(s + "  ");
			s++;
		}
		System.out.println("  ");
		System.out.print("--------------------------------------------------------  ");
		System.out.println("  ");

		// 80 to 63
		int v = 80;
		while (v >= 63) {
			System.out.print(v + "  ");
			--v;
		}
		System.out.println("  ");
		System.out.print("--------------------------------------------------------  ");
		System.out.println("  ");

		// for even number
		int p = 0;
		while (p <= 24) {
			if (0%2 == 0) {
				System.out.print(p + " ");
			}
			p++;
		}
		System.out.println("  ");
		System.out.print("--------------------------------------------------------  ");
		System.out.println("  ");

		// for odd number
		int o = 0;
		while (o <= 25) {
			if (0%2 != 0) {
				System.out.print(o + " ");
			}
			o++;

		}

	}
}
