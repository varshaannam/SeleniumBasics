package com.seleniumlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("hello");
		WebElement show =driver.findElement(By.id("button-one"));
		show.click();
		WebElement valueA =driver.findElement(By.id("value-a"));
		valueA.sendKeys("12");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("13");
		WebElement total = driver.findElement(By.id("button-two"));
		total.click();
		/*WebElement message=driver.findElement(By.xpath());
		message.sendKeys("hello");
		WebElement show =driver.findElement(By.id("button-one"));
		show.click();
		WebElement valueA =driver.findElement(By.id("value-a"));
		valueA.sendKeys("12");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("13");
		WebElement total = driver.findElement(By.id("button-two"));
		total.click();*/
		
		

	}

}
