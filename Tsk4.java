package org.booking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tsk4 extends Base{
	
	
	public static void main(String[] args) throws InterruptedException {
	
		Tsk4 tsk4 = new Tsk4();
		tsk4.price();
	}
	public void price() throws InterruptedException {
		
	WebDriver driver;
	driver=new EdgeDriver();
	driver.get("https://omrbranch.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	driver.findElement(By.id("email")).sendKeys("manoj.m0399@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Manoj@1313");
	
	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement state = driver.findElement(By.id("state"));
	elementDdnIndex(state, 5);
	
    WebElement city=driver.findElement(By.id("city"));
    elementDdnIndex(city, 1);
	
	WebElement roomtype= driver.findElement(By.xpath("//select[@name='room_type[]']"));
	Select room = new Select(roomtype);
		room.selectByIndex(1);	
		room.selectByIndex(2);
		room.selectByIndex(3);
		room.selectByIndex(4);
		room.selectByIndex(5);
	driver.findElement(By.xpath("//input[@name='check_in']")).click();
	
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
	
	driver.findElement(By.xpath("//input[@name='check_out']")).click();
	
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']")).click();
	
	WebElement no_of_rooms = driver.findElement(By.id("no_rooms"));
	elementDdnIndex(no_of_rooms, 2);
	
	WebElement no_adults = driver.findElement(By.id("no_adults"));
    elementDdnIndex(no_adults, 3);
    
    WebElement no_child = driver.findElement(By.id("no_child"));
    no_child.sendKeys("1");
    
    WebElement frmeswitch = driver.findElement(By.id("hotelsearch_iframe"));
    driver.switchTo().frame(frmeswitch);
 	    	
    WebElement search_button= driver.findElement(By.id("searchBtn"));
	search_button.click();
	    
	Thread.sleep(3000);
	
	List<WebElement> elements = driver.findElements(By.xpath("//strong[contains(text(),'$')]"));
	for (WebElement webElement : elements) {
		String price = webElement.getText();
        System.out.println(price);	
	}
	
	
	}
}
