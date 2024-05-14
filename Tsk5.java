package org.booking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tsk5 extends Base{
	
	
	
public static void main(String[] args) throws InterruptedException {
		
		Tsk5 tsk5 = new Tsk5();
		tsk5.payment();
	}
	
		public void payment() throws InterruptedException {
			
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
			    	 
		           
			    	driver.findElement(By.xpath(("(//div//a[contains(text(),'Continue')])[1]"))).click();
			 	    
			 	    Alert alert = driver.switchTo().alert();
			 	    alert.accept();		
			 	    
			 	    Thread.sleep(3000);
			 	
			    	
			    driver.findElement(By.id("own")).click();
			    WebElement usertitle = driver.findElement(By.id("user_title"));
		      
			    Select usertitle1= new Select(usertitle);
			    usertitle1.selectByIndex(1);
			    
			    driver.findElement(By.id("first_name")).sendKeys("manoj");
			    driver.findElement(By.id("last_name")).sendKeys("kumar");
			    driver.findElement(By.id("user_phone")).sendKeys("6380087971");
			    driver.findElement(By.id("user_email")).sendKeys("manoj.m0399@gmail.com");
			    
			    driver.findElement(By.id("gst")).click();
			    driver.findElement(By.id("gst_registration")).sendKeys("9043592058");
			    driver.findElement(By.id("company_name")).sendKeys("Greens Tech OMR Branch");
			    driver.findElement(By.id("company_address")).sendKeys("Thoraipakkam");

			    
			    driver.findElement(By.id("step1next")).click();
			        

			    List<WebElement> elements = driver.findElements(By.xpath("//div//input[@name='special_request[]']"));
			    	
			    for (WebElement webElement : elements) {
			    		webElement.click();		    		
					}
			    
			    	driver.findElement(By.id("step2next")).click();		       
			    	driver.findElement(By.xpath("//div[@class='credit-card pm']")).click();
			    	
			    	 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			    	
			    	String text1 = driver.findElement(By.xpath("//div[.='Please select your card type']")).getText();
			    	System.out.println(text1);
			    	String text2 = driver.findElement(By.xpath("//div[.='Please select your card type']")).getText();
			    	System.out.println(text2);
			    	String text3 = driver.findElement(By.xpath("//div[.='Please select your card']")).getText();
			    	System.out.println(text3);
			    	String text4 = driver.findElement(By.xpath("//div[.='Please provide your card number']")).getText();
			    	System.out.println(text4);
			    	String text5 = driver.findElement(By.xpath("//div[.='Please provide name on your card']")).getText();
			    	System.out.println(text5);
			    	String text6 = driver.findElement(By.xpath("//div[.='Please provide your Card Expiry Date']")).getText();
			    	System.out.println(text6);
			    	String text7 = driver.findElement(By.xpath("//div[@id='invalid-cvv']")).getText();
			    	System.out.println(text7);
			    	
			    	
			    	 
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	

}
}
