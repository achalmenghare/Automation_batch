package robot_class;

import java.awt.AWTException;

import dynamic_code.Robot_class;

public class Robot extends Robot_class {

	public static void main(String[] args) throws AWTException {

		launch_Browser("chrome");
		hiturl("https://www.ilovepdf.com/word_to_pdf");

		Upload_file("//span[text()=\"Select WORD files\"]",
				"\"C:\\Users\\DELL\\OneDrive\\Documents\\API Testing using Postman with "
						+ "Practical Scenarios - by STP.docx\"");

	}

}
