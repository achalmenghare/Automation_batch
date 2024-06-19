package TestNG_001;

import org.testng.annotations.Test;

public class Groups_parameter {
	@Test(groups = {"high"})
	public void launchbrowser() {
		System.out.println("launchbrowser");
	}

	@Test(groups = {"high"})
	public void hiturl() {
		System.out.println("hiturl");
	}

	@Test(groups = {"high"})
	public void webelemet() {
		System.out.println("webelement");
	}

	@Test(groups = {"medium"})
	public void clickonsearchbox() {
		System.out.println("clickonsearchbox");
	}

	@Test(groups = {"medium"})
	public void sendkeys() {
		System.out.println("sendkeys");
	}

	@Test(groups = { "medium"})
	public void clickonsearchbtn() {
		System.out.println("clickonsearchbtn");
	}
	@Test(groups = { "low"})
	public void cosmeticessue() {
		System.out.println("cosmeticessue");
	}

}
