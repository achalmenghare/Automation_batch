package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Drag_drop extends Base_class {

	public static void main(String[] args) {

		launch_Browser("chrome");

		hiturl("https://jqueryui.com/");

		Actions action = new Actions(driver);

		WebElement dropable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		action.moveToElement(dropable).click().build().perform();

		 WebElement frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);

		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));

		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		//action.dragAndDrop(drag, drop).build().perform();

		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	    
		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	
	   driver.switchTo().defaultContent();
	   driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();
	
	   System.out.println("the current tile is:"+driver.getTitle());
	}

}
