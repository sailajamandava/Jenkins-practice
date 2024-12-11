package com.example.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;




public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		
		driver.findElement(By.xpath("//input[contains(@value,'Delhi (DEL)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(.,'BLR')])[16]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(.,'MAA')])[17]")).click();
		driver.findElement(By.cssSelector(".css-76zvg2.r-jwli3a.r-ubezar.r-16dba41")).click();

	}

}
