package TestNG_001;

import org.testng.annotations.Test;

public class Invocation_count {
	@Test(invocationCount = 2, priority = 1)
	public void nagpur() {
		System.out.println("nagpur");
	}

	@Test(invocationCount = 3, priority = 0,enabled = false)
	public void wardha() {
		System.out.println("wardha");
	}

	@Test(invocationCount = 1, priority = 2)
	public void pune() {
		System.out.println("pune");
	}

	@Test(invocationCount = 4, priority = 3,enabled = false)
	public void nashik() {
		System.out.println("nashik");
	}

}
