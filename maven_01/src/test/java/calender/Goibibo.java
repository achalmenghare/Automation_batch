package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Goibibo extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");

		hiturl("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup");

		WebElement calender = driver.findElement(By.xpath("(//div[@style=\"width: 142px;\"])[1]"));
		calender.click();

		// driver.findElement(By.xpath("(//p[text()=\"24\"])[1]")).click();
		// System.out.println("the date selected is :" + calender.getText());

		 

		while (true) {
			String month_year = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();
			System.out.println("the current month and year is:" + month_year);

			if (!month_year.equalsIgnoreCase("october 2024")) {
				driver.findElement(By.xpath("(//span[@aria-label=\"Next Month\"])[1]")).click();

			} else {
				break;

			}

		}
		driver.findElement(By.xpath("(//p[text()=\"10\"])[1]")).click();
		System.out.println("the selected date is:"+calender.getText());

	}

}
