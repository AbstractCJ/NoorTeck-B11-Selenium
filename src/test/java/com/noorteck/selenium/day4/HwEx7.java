package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Hooks;

public class HwEx7 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	//navigate to page
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//click on first Iframe
	WebElement step1 = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']"));
	Thread.sleep(2000);
	step1.click();
	
	WebElement step2 = driver.findElement(By.xpath("//a[@href='Alert.html']"));
	Thread.sleep(2000);
	step2.click();
	
	String interfaceAlert = driver.getTitle();
	
	if (interfaceAlert.equals("Interface Alert")) {
		System.out.println("TESTCASE PASSED");
	}else {
		System.out.println("TESTCASE FAILED");
	}
	
	
	WebElement step3= driver.findElement(By.xpath("//a[text()='Overview']"));
	Thread.sleep(2000);
	step3.click();
	Thread.sleep(2000);
	
	WebElement step4 = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-summary.html']"));
	Thread.sleep(2000);
	step4.click();
	
	WebElement step5 = driver.findElement(By.xpath("//a[@href=\"ChromeDriver.html\"]"));
	Thread.sleep(2000);
	step5.click();

	String chromeClass = driver.getTitle();
	if (interfaceAlert.equals("Class ChromeDriver")) {
		System.out.println("TESTCASE PASSED");
	}else {
		System.out.println("TESTCASE FAILED");
	}
	
	tearDown();
	}
}
