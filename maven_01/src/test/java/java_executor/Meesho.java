package java_executor;

import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.Base_class;

public class Meesho extends Base_class {

	public static void main(String[] args) throws Throwable {
		// browser launch
				launch_Browser("firefox");

				// hit url
				hiturl("https://www.meesho.com");

				JavascriptExecutor js = (JavascriptExecutor) driver;

				// scroll
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,1000)");

				// scroll to bottom
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

				// scrollup
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,-1000)");

				// refresh
				Thread.sleep(3000);
				js.executeScript("window.history.go(0)");

				// back
				Thread.sleep(3000);
				js.executeScript("window.history.back()");

				// forward
				Thread.sleep(3000);
				js.executeScript("window.history.forward()");

				// close
				driver.close();

	}
}
