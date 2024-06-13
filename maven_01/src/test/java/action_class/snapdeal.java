package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class snapdeal extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");

		hiturl("https://snapdeal.com/");

		Actions action = new Actions(driver);

		WebElement Homeandkitchen = driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]"));
		action.moveToElement(Homeandkitchen).build().perform();

		WebElement Electronics = driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
		Thread.sleep(2000);
		action.moveToElement(Electronics).build().perform();

		WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));
		Thread.sleep(2000);
		action.moveToElement(search).click().sendKeys("mobiles").doubleClick().contextClick().build().perform();

	}

}
