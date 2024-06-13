package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Keyboard_class extends Base_class {

	public static void main(String[] args) throws InterruptedException {
		
		launch_Browser("chrome");
		
		hiturl("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
		WebElement mobile_no = driver.findElement(By.cssSelector("input#phoneNumber"));
		action.moveToElement(mobile_no).click().sendKeys("6958425678").build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.TAB).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.cssSelector("div#eye")).click();
		
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		
		driver.close();
		
	}

}
