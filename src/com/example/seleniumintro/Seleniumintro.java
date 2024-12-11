package com.example.seleniumintro;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumintro {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRONIX-DEV-44\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();



	}

}
