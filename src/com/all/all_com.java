package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_com {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		WebElement find = driver.findElement(By.id("canvas"));
		find.click();
		//Thread.sleep(2000);
		//WebElement login = driver.findElement(By.name("email"));
		//login.sendKeys("welcome");
        
	     
	}

}
