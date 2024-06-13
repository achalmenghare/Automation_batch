package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Alerts extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");
		

		hiturl("https://demoqa.com/");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		screenshot("scroll");

		driver.findElement(By.xpath("//h5[text()=\"Alerts, Frame & Windows\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Alerts\"]")).click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		screenshot("scroll1");

		// simple alert

		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[1]")).click();
        Alert simple_alert = driver.switchTo().alert();
		System.out.println(simple_alert.getText());
		simple_alert.accept();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
        Alert simple_alert1 = driver.switchTo().alert();
		System.out.println(simple_alert1.getText());
		Thread.sleep(2000);
		simple_alert1.accept();

		System.out.println("-----------------------------------------------------------");

		// confirmation alert

		driver.findElement(By.cssSelector("button#confirmButton")).click();
        Alert confirm_alert = driver.switchTo().alert();
		System.out.println(confirm_alert.getText());
		Thread.sleep(2000);
		confirm_alert.accept();

//		WebElement text_msg = driver.findElement(By.cssSelector("span#confirmResult"));
//		text_msg.getAttribute("value");
		// confirm_alert.dismiss();

		System.out.println("---------------------------------------------------------------");

		// prompt alert

		driver.findElement(By.cssSelector("button#promtButton")).click();
        Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		Thread.sleep(2000);
		prompt_alert.sendKeys("selenium");
		prompt_alert.accept();
		

	}

}
