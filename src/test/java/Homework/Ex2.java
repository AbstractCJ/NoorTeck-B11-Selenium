package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks;

public class Ex2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		WebElement registerBtn = driver.findElement(By.linkText("REGISTER"));
		registerBtn.click();
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Cindy");
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Garcia");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("813-555-5555");
		WebElement email = driver.findElement(By.name("userName"));
		email.sendKeys("cindyjogarcia2@gamil.com");
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("1527 Nittany Ct.");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Valrico");
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("FL");
		WebElement zip = driver.findElement(By.name("postalCode"));
		zip.sendKeys("33596");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("cindyjogarcia2@gamil.com");
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Password1");
		WebElement passWordConfirm = driver.findElement(By.name("confirmPassword"));
		passWordConfirm.sendKeys("Password1");
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		System.out.println("TESTCASE PASSED!!!");
		
		tearDown();
	}
}
