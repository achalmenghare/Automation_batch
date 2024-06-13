package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Naukri extends Base_class {
	
	public static void main(String[] args) throws Throwable {
		
		launch_Browser("chrome");
		hiturl("https://www.naukri.com/");

		WebElement register = driver.findElement(By.id("register_Layer"));

		register.click();

		WebElement name = driver.findElement(By.xpath("//input[@id=\"name\"]"));

		name.click();
		name.sendKeys("achal padmakar menghare");

		// getattribute
		System.out.println("the text entered is:" + name.getAttribute("value"));
		Thread.sleep(4000);
		name.clear();

		// gettext method

		WebElement google = driver.findElement(By.name("google-register"));
		System.out.println("the text of webelement is:" + google.getText());

		// getattribute
		System.out.println("the value of name attribute is:" + google.getAttribute("name"));

		// getlocaton
		WebElement register1 = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

		System.out.println("x coorinate is:" + register1.getLocation().x);
		System.out.println("y coorinate is:" + register1.getLocation().y);

		System.out.println("the size of text is :" + register1.getSize());

		System.out.println("the tagname for register btn is:" + register1.getTagName());

		System.out.println("register btn is displaye on ui :" + register1.isDisplayed());

		System.out.println("register btn is enable on ui :" + register1.isEnabled());

		System.out.println("register btn is selected :" + register1.isSelected());
		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}
	
	
	
}
