package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Parent_child extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");
		screenshot("browser");

		hiturl("https://www.naukri.com/");
		screenshot("url");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("scroll_bottom");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"Careers\"]")).click();
		Thread.sleep(2000);
		screenshot("click_careers");

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> id = windows.iterator();

		String parent_id = id.next();
		System.out.println("the parent id is:" + parent_id);

		String child_id = id.next();
		System.out.println("the child id is:" + child_id);

		Thread.sleep(2000);
		driver.switchTo().window(child_id);
		System.out.println("shifted to child window");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#values-btn")).click();
		screenshot("click_office");
		System.out.println("clicked on office");

		Thread.sleep(2000);
		driver.switchTo().window(parent_id);
		System.out.println("back to parent window");

		Actions action = new Actions(driver);

		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_UP).build().perform();
       screenshot("page_up");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
