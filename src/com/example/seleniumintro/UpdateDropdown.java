package com.example.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


//import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		

		driver.findElement(By.xpath("(//div[contains(.,'1 Adult')])[12]")).click();
		Thread.sleep(2000L);
		int i=1;
		while(i<5) {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();//4 times
		i++;
		}
		driver.findElement(By.xpath("(//div[contains(.,'Done')])[14]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(.,'5 Adults')])[12]")).getText());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());




	}


}
