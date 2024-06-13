package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class parent_child_1 extends Base_class {

	public static void main(String[] args) throws Throwable {
		
	launch_Browser("chrome");	
	screenshot("browser");
	
	hiturl("https://www.redbus.in/");	
    screenshot("url");
   
    Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	screenshot("scroll_bottom");
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a#offers_footer")).click();
	screenshot("click_on_offers");
		
	Set<String> windows = driver.getWindowHandles();
    Iterator<String> id = windows.iterator();
	
	String parent_id = id.next();
	System.out.println("the parent id is:"+parent_id);
	
	String child_id = id.next();
	System.out.println("the child id is:"+child_id);
	
	Thread.sleep(2000);
	driver.switchTo().window(child_id);
	System.out.println("shifted to child window");
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("li#bus_tickets_vertical")).click();
	screenshot("click_on_bus_tickets");
	
	Thread.sleep(2000);
	driver.switchTo().window(parent_id);
	System.out.println("shifted to parent window");
	
	Actions action= new Actions(driver);
	
	action.keyDown(Keys.PAGE_UP).build().perform();
	Thread.sleep(2000);
	action.keyDown(Keys.PAGE_UP).build().perform();
	Thread.sleep(2000);
	action.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	action.keyDown(Keys.PAGE_DOWN).build().perform();

	
	driver.quit();
	
	}

}
