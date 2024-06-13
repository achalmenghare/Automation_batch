package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");

		WebElement profile = driver.findElement(By.cssSelector("select#reg_relationship"));
		profile.click();

		Select select = new Select(profile);
		select.selectByVisibleText("Daughter");

		WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		day.click();

		Select select1 = new Select(day);
		select1.selectByValue("17");

		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
		month.click();

		Select select2 = new Select(month);
		select2.selectByIndex(10);

		WebElement year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));
		year.click();

		Select select3 = new Select(year);
		select3.selectByIndex(2);

		WebElement height = driver.findElement(By.cssSelector("select#reg_height"));
		height.click();

		Select select4 = new Select(height);
		select4.selectByVisibleText("5' 7\" (1.70 mts)");

		WebElement marital_sts = driver.findElement(By.cssSelector("select#reg_mstatus"));
		marital_sts.click();

		Select select5 = new Select(marital_sts);
		select5.selectByValue("M");

		WebElement mother_tongue = driver.findElement(By.cssSelector("select#reg_mtongue"));
		mother_tongue.click();

		Select select6 = new Select(mother_tongue);
		select6.selectByVisibleText("Marathi");
		
		//static dropdown by using loop
		
		//religion

		WebElement religion = driver.findElement(By.xpath("//span[text()=\"Select or Type Religion\"]"));
		religion.click();
		List<WebElement> religion_option = driver.findElements(By.xpath("//ul[@class=\"chzn-results\"]//child::li"));

		for (int a = 0; a < religion_option.size(); ++a) {
			if (religion_option.get(a).getText().contains("Hindu")) {
				religion_option.get(a).click();
			}

		}
		
		
	
		

	
	}
}
