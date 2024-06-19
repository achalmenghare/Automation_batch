package TestNG_001;

import org.testng.annotations.Test;

public class Priority_parameter {
	@Test(priority = 1)
	public void manual() {
		System.out.println("manual");
	}

	@Test(priority = 3,description = "automation based on manual")
	public void automation() {
		System.out.println("automation");
	}

	@Test(priority = 2)
	public void sql() {
		System.out.println("sql");
	}

	@Test(priority = 0)
	public void api() {
		System.out.println("api");
	}

	@Test(priority = 4)
	public void mobile_testing() {
		System.out.println("mobile_testing");
	}

}
