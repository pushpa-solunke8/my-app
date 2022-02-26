package com.mycompany.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
	
	public WebDriver driver;
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\newversion98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
	}
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\geckfirefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
	}

}
