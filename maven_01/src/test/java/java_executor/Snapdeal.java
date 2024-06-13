package java_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Snapdeal extends Base_class {

	public static void main(String[] args) throws Throwable {
	launch_Browser("edge");	
     screenshot("browser");
	
	hiturl("https://snapdeal.com/");
	screenshot("url");
	
	WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));
	search.click();
	search.sendKeys("Tshirt");
	screenshot("search");
	
	driver.findElement(By.cssSelector("span.searchTextSpan")).click();
	screenshot("result");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1300)");
	screenshot("scroll");
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	screenshot("scroll_bottom");
	
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-1100)");
	screenshot("scroll_up");
	
	Thread.sleep(3000);
	js.executeScript("window.history.go(0)");
	screenshot("refresh");
	
	Thread.sleep(3000);
	js.executeScript("window.history.back()");
	screenshot("back");
	
	Thread.sleep(3000);
	js.executeScript("window.history.forward()");
	screenshot("forward");
	
	driver.close();
	}

}
