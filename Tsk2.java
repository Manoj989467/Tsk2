package org.booking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tsk2 {
	public static void main(String[] args) {
		

	    WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://omrbranch.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.findElement(By.id("email")).sendKeys("manoj.m0399@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Manoj@1313");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement frmeswitch1 = driver.findElement(By.id("hotelsearch_iframe"));
	    driver.switchTo().frame(frmeswitch1);
		WebElement search_button= driver.findElement(By.id("searchBtn"));
	    search_button.click();
	    
	    driver.switchTo().parentFrame();
	    
	    String text1 = driver.findElement(By.xpath("//div[.='Please select state']")).getText();
	    System.out.println(text1);
	    String text2 = driver.findElement(By.xpath("//div[.='Please select city']")).getText();
	    System.out.println(text2);
	    String text3 = driver.findElement(By.xpath("//div[.='Please select Check-in date']")).getText();
	    System.out.println(text3);
	    String text4 = driver.findElement(By.xpath("//div[.='Please select Check-out date']")).getText();
	    System.out.println(text4);
	    String text5 = driver.findElement(By.xpath("//div[.='Please select no. of rooms']")).getText();
	    System.out.println(text5);
	    String text6 = driver.findElement(By.xpath("//div[.='Please select no. of adults']")).getText();
	    System.out.println(text6);
	   
	   
	   
	}
}
