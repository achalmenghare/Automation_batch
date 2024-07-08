package base_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNG_class extends Properties_file_baseclass {
	@Test
	public void f() throws Exception {

		property_file();
        open_browser("chromebrowser");
        navigate_url("automationpraurl");
		System.out.println(B_U.getProperty("chromebrowser"));
		System.out.println(B_U.getProperty("automationpraurl"));
		
		System.out.println(data.getProperty("useremail"));
		System.out.println(data.getProperty("password"));

		driver.findElement(By.xpath(locators.getProperty("sign_in_button_css"))).click();
		
		driver.findElement(By.cssSelector(locators.getProperty("enter_email_css"))).sendKeys(data.getProperty("useremail"));
		
		driver.findElement(By.cssSelector(locators.getProperty("enter_pass_css"))).sendKeys(data.getProperty("password"));
		
		driver.findElement(By.cssSelector(locators.getProperty("signin_submit_css"))).click();
	}
}
