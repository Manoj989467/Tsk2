package org.booking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class tsk1 extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		tsk1 tsk = new tsk1();
		tsk.booking();
	}
	
		public void booking() throws InterruptedException {
			
	            WebDriver driver;
				driver=new EdgeDriver();
				driver.get("https://omrbranch.com/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						
				driver.findElement(By.id("email")).sendKeys("manoj.m0399@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Manoj@1313");
				
				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();  
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
				String text=driver.findElement(By.xpath("//a[@data-testid='username']")).getText();
				 System.out.println(text);
					
			    
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
			    	 
			 	String selecthotel = driver.findElement(By.xpath("//h5[@class='font35 font-weight-bold mb-4']")).getText();
				System.out.println(selecthotel);
				
				String firsthotel = driver.findElement(By.xpath("//div//h5[.='Hyatt Regency Chennai Deluxe']")).getText();
				System.out.println(firsthotel);
				    
				    String price = driver.findElement(By.xpath("(//strong[@class='total-prize'])[1]")).getText();
				    System.out.println(price);
				    
		           
			    	driver.findElement(By.xpath(("(//div//a[contains(text(),'Continue')])[1]"))).click();
			 	    
			 	    Alert alert = driver.switchTo().alert();
			 	    alert.accept();		
			 	    
			 	    Thread.sleep(3000);
			 	    
			 	    String text3 = driver.findElement(By.xpath("//h2[contains(text(),'Book Hotel')]")).getText();
				    System.out.println(text3);
			 
			    	
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
			    	
			    	WebElement payment_type = driver.findElement(By.id("payment_type"));
			    	Select paymenttype = new Select(payment_type);
			    	paymenttype.selectByIndex(1);
			    	
			    	WebElement card_type = driver.findElement(By.id("card_type"));
			    	Select cardtype = new Select(card_type);
			    	cardtype.selectByIndex(1);
			    	
			    	driver.findElement(By.id("card_no")).sendKeys("5555555555552222");
			    	driver.findElement(By.id("card_name")).sendKeys("mnj");
			    	
			    	WebElement card_month = driver.findElement(By.id("card_month"));
			      	Select cardmonth = new Select(card_month);
			    	cardmonth.selectByIndex(3);
			   
			    	WebElement card_year =driver.findElement(By.id("card_year"));
			    	Select cardyear = new Select(card_year);
			    	cardyear.selectByIndex(3);
			        
			        driver.findElement(By.id("cvv")).sendKeys("234");
			        
			        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			        
			        String bookingid = driver.findElement(By.xpath(" //h2[@name='booking-code']")).getText();
			        System.out.println(bookingid);
			        
			        String hotelname = driver.findElement(By.xpath("//p[contains(text(),'Hotel ')]")).getText();
			        System.out.println(hotelname);
			        Thread.sleep(3000);
			        
			        //modify
			        
			        driver.findElement(By.xpath("//a[@data-testid='username']")).click();
			  	   driver.findElement(By.xpath("//a[.='My Account']")).click();
			  	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			  	   driver.findElement(By.xpath("//a[.='My Bookings']")).click();
			  	   String bookings = driver.findElement(By.xpath("//div//h4[contains(text(),'Bookings')] ")).getText();
			        System.out.println(bookings);
			        
			        String hotelnme = driver.findElement(By.xpath("//h5[.='Hyatt Regency Chennai Suite']")).getText();
			        System.out.println(hotelnme);
			       
			        String price1 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[1]")).getText();
			        System.out.println(price1);
			      
			        driver.findElement(By.xpath("//button[@class='edit btn filter_btn']")).click();
			        Thread.sleep(3000);
			        
			        driver.findElement(By.xpath("//input[@name='check_in']")).click();
			        driver.findElement(By.xpath("//a[@class='ui-state-default' and .='18']")).click();
			        driver.findElement(By.xpath("//button[.='Confirm']")).click();
			        
			       String cncel = driver.findElement(By.xpath("//li[.='Booking updated successfully']")).getText();
                   System.out.println(cncel);
			      
                   //cancel booking
                   
                   driver.findElement(By.xpath("//a[@data-testid='username']")).click();
			  	   driver.findElement(By.xpath("//a[.='My Account']")).click();
			  	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			  	   driver.findElement(By.xpath("//a[.='My Bookings']")).click();
			  	   String bookings1 = driver.findElement(By.xpath("//div//h4[contains(text(),'Bookings')] ")).getText();
			        System.out.println(bookings1);
			        
			        String hotelnme1 = driver.findElement(By.xpath("//h5[.='Hyatt Regency Chennai Suite']")).getText();
			        System.out.println(hotelnme1);
			       
			        String price2 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[1]")).getText();
			        System.out.println(price2);
			        
			        driver.findElement(By.xpath("//a[.='Cancel']")).click();
			        Alert alert2 = driver.switchTo().alert();
			        alert2.accept();
			        Thread.sleep(3000);
		            String canceltext = driver.findElement(By.xpath("//li[@class='alertMsg']")).getText();
			        System.out.println(canceltext);

		}
	}


			

