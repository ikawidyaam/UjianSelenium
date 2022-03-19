package com.juaracoding.selenium.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UjianSelenium {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		//complete
		WebElement btnAdd = driver.findElement(By.cssSelector("#addNewRecordButton"));
		btnAdd.click();
		
		WebElement inputFirstName = driver.findElement(By.id("firstName"));
		inputFirstName.sendKeys("ika");		
		
		WebElement inputLastName = driver.findElement(By.id("lastName"));
		inputLastName.sendKeys("widya");
		
		WebElement inputEmail = driver.findElement(By.id("userEmail"));
		inputEmail.sendKeys("ika@gmail.com");
		
		WebElement inputAge = driver.findElement(By.id("age"));
		inputAge.sendKeys("19");
		
		WebElement inputSalary = driver.findElement(By.id("salary"));
		inputSalary.sendKeys("900");
		
		WebElement inputDepartment = driver.findElement(By.id("department"));
		inputDepartment.sendKeys("Jc");
		
		WebElement Submit = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(Submit));
		Submit.click();

}
}
