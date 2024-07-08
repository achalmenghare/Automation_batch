package java_control_statement;

public class nested_if_statement {

	public static void main(String[] args) {
		short r = 200;
		if (r != 200) {
			System.out.println("the value of r is not equal to 200");

			if (r > 300) {
				System.out.println("the value of r is greater than 300");

				if (r < 170) {
					System.out.println("the value of r is less than170");

					if (r == 202) {
						System.out.println("the value of r is equal to 202");
					}
				}
			}
		} else {
			System.out.println("all of the above");
		}

		System.out.println("--------------------------------------");

		if (r == 200) {
			System.out.println("the value of r is equal to 200");

			if (r < 300) {
				System.out.println("the value of r is less than 300");

				if (r > 170) {
					System.out.println("the value of r is greater than 170");

					if (r != 202) {
						System.out.println("the value of r is not equal to 202");
					}
				}
			}
		} else {
			System.out.println("all of the above");
		}

		
			
		}

	}


