package com.seleniumlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP%20LAPTOP/Desktop/selenium%201.html");
		/*WebElement name = driver.findElement(By.id("001"));
		name.sendKeys("varsha");
		WebElement male = driver.findElement(By.id("002"));
		male.click();
		WebElement female = driver.findElement(By.id("003"));
		female.click();
		WebElement agree = driver.findElement(By.id("004"));
		agree.click();
		WebElement ok = driver.findElement(By.id("005"));
		ok.click();*/
		WebElement name=driver.findElement(By.name("A"));
		name.sendKeys("varsha");
		WebElement male = driver.findElement(By.name("b"));
		male.click();
		WebElement female = driver.findElement(By.name("C"));
		female.click();
		WebElement agree = driver.findElement(By.id("004"));
		agree.click();
		WebElement ok = driver.findElement(By.id("005"));
		ok.click();
		
		
		
	}

}
