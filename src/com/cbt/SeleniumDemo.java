package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// below code sets path and opens chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/filiz/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.cybertekschool.com");

//		System.setProperty("webdriver.gecko.driver",
//				"C:/Users/filiz/Documents/selenium dependencies/drivers/geckodriver.exe");
//		WebDriver driver2 = new FirefoxDriver();
//		driver2.get("http://www.cybertekschool.com");

//		System.setProperty("webdriver.edge.driver",
//				"C:/Users/filiz/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");
//		WebDriver driver3 = new EdgeDriver();
//		driver3.get("http://www.cybertekschool.com");

//		System.setProperty("webdriver.ie.driver",
//				"C:/Users/filiz/Documents/selenium dependencies/drivers/IEDriverServer.exe");
//		WebDriver driver4 = new InternetExplorerDriver();
//		driver4.get("http://www.cybertekschool.com");
	}

}
