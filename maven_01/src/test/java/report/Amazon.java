package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.devtools.v117.page.model.ScreencastFrame;

import dynamic_code.Extent_reports;

public class Amazon extends Extent_reports {

	public static void main(String[] args) throws Throwable {
		reports("New report", "Amazon report", "Amazon");

		Test("browser", "chrome browser");
		Test("url", "amazon");
		Test("searchbox", "find searchbox");
		Test("text enter", "search product");
		Test("find search btn", "click on search btn");

		launch_Browser("chrome");
		screenshot("browser launched");
		addscreencapture("browser launched");

		hiturl("https://www.amazon.in/");
		screenshot("url hit");
		addscreencapture("url hit");

	   WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.click();
		screenshot("click on search box");
		addscreencapture("click on search box");
		
	    search.sendKeys("earburd");
	    screenshot("searched");
		addscreencapture("searched");
	    er.flush() ;
		
	}
     
}
