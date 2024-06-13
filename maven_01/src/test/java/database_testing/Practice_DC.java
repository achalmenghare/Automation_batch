package database_testing;

import dynamic_code.database_testing;

public class Practice_DC extends database_testing {

	public static void main(String[] args) throws Throwable {
		launch_Browser("chrome");
		takesscreenshot("browser launched");
		
		hiturl("https://www.instagram.com/");
		takesscreenshot("hit url");
		
		database_connection("january", "select email,password from data_001 where sr_no = 4;");
		database_coloumn("email", "(//input[@class=\"_aa4b _add6 _ac4d _ap35\"])[1]");
		takesscreenshot("email entered");

		Thread.sleep(2000);
		database_coloumn("password", "(//input[@name=\"password\"])[1]");
		takesscreenshot("password entered");
	
	    driver.close();
	}

}
