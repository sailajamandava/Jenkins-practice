package com.example.seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class end2end {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://spicejet.com");
			driver.findElement(By.xpath("//input[contains(@value,'Delhi (DEL)')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(.,'BLR')])[16]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(.,'MAA')])[17]")).click();
			driver.findElement(By.xpath("(//div[contains(.,'6')])[20]")).click();
			driver.findElement(By.xpath("(//div[contains(.,'1 Adult')])[12]")).click();
			Thread.sleep(2000L);
			int i=1;
			while(i<5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();//4 times
			i++;
			}
			driver.findElement(By.xpath("(//div[contains(.,'Done')])[14]")).click();
			System.out.println(driver.findElement(By.xpath("(//div[contains(.,'5 Adults')])[12]")).getText());
			Thread.sleep(2000);
			Assert.assertFalse(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][contains(.,'Students')]")).isSelected());

			Assert.assertFalse(false);System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][contains(.,'Students')]")).isSelected());



			driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][contains(.,'Students')]")).click();
			Thread.sleep(2000);
			//driver.findElement(By.cssSelector(".css-1dbjc4n.r-19m6qjp.r-z2wwpe.r-1loqt21.r-1777fci.r-1e081e0.r-1f1sjgu.r-ah5dr5.r-1otgn73")).click();
driver.findElement(By.xpath("(//div[contains(.,'Search Flight')])[9]")).click();
	}

}
