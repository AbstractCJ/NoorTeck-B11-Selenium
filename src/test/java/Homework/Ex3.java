package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks;

public class Ex3 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement firstName = driver.findElement(By.name("FirstName"));
		firstName.sendKeys("Cindy");
		WebElement lastName = driver.findElement(By.name("LastName"));
		lastName.sendKeys("Garcia");
		WebElement dobDay = driver.findElement(By.name("DateOfBirthDay"));
		dobDay.sendKeys("20");
		WebElement dobMonth = driver.findElement(By.name("DateOfBirthMonth"));
		dobMonth.sendKeys("3");
		WebElement dobYear = driver.findElement(By.name("DateOfBirthYear"));
		dobYear.sendKeys("1979");
		WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("cindyjogarcia@gmail.com");
		WebElement companyName = driver.findElement(By.name("Company"));
		companyName.sendKeys("NoorTeck");
		WebElement newsLetter = driver.findElement(By.name("Newsletter"));
		newsLetter.click();
		WebElement Password = driver.findElement(By.name("Password"));
		Password.sendKeys("Password1");
		WebElement ConfirmPassword = driver.findElement(By.name("ConfirmPassword"));
		ConfirmPassword.sendKeys("Password1");
		WebElement regBtn = driver.findElement(By.name("register-button"));
		regBtn.click();
		System.out.println("TESTCASE PASSED");
		
		
		
		
		
		tearDown();
	}

}
