package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/filiz/Documents/selenium dependencies/drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.etsy.com");

	}

}
