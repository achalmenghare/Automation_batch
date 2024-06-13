package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_1 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.instagram.com");

		WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
		username.click();
		username.sendKeys("achalmenghare77@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.click();
		password.sendKeys("5896555");

		//Thread.sleep(3000);
		password.clear();

		WebElement FP = driver.findElement(By.className(
				"x1lliihq x1plvlek xryxfnj x1n2onr6 x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso"
						+ " x1gmr53x x1cpjm7i x1fgarty"
						+ " x1943h6x x1i0vuye x1fhwpqd xo1l8bm x7l2uk3 x10wh9bi x1wdrske x8viiok x18hxmgj"));

		// System.out.println("the text of webelement is:"+FP.getText());

		//FP.click();
	//	System.out.println("the text entered is:" + FP.getAttribute("class"));

		WebElement login = driver.findElement(By.className("body[class=\"_a3wf system-fonts--body segoe\"]"));
		System.out.println("the x coordinate is:"+login.getLocation().x);
		System.out.println("the x coordinate is:"+login.getLocation().y);
		System.out.println("the size is:"+login.getSize());

	}

}
