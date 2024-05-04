package org.adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Adactin extends Base{

//@BeforeClass
//public static void driverlaunch() {
//		
//	browserLaunch();
//	
//	launchtheappln("http://www.adactin.com/HotelApp/");
//	maximize();
//}
//  @AfterClass
//  public void closetab() {
//  closeCurrent();
//  }
//  
//  @Test(priority = -20)
//   private void login() throws IOException, InterruptedException {
//	
//	 WebElement element1 = locatorbyid("username");
//	 elementSendKeys(getcelldata("Adactin", 1, 0), element1);
//	
//	 WebElement element2 = locatorbyid("password");
//	 elementSendKeys(getcelldata("Adactin", 1, 1),element2);
//	
//	 WebElement loginclick=locatorbyid("login");
//     elementClick(loginclick);
//	 implicitWait();
//  }
//    @Test(priority = -15)
//	public  void search() throws IOException, InterruptedException {
//    WebElement element3=locatorbyid("location");
//    elementDdnText(element3,getcelldata("Adactin", 1, 2));
//	
//	WebElement element4=locatorbyid("hotels");
//	elementDdnText(element4, getcelldata("Adactin",1, 3));
//	
//	WebElement element5=locatorbyid("room_type");
//	elementDdnText(element5, getcelldata("Adactin", 1, 4));
//	
//	WebElement element6=locatorbyid("room_nos");
//	elementDdnText(element6, getcelldata("Adactin", 1, 5));
//	
//	WebElement element7 = locatorbyid("datepick_in");
//	element7.clear();
//	elementSendKeys(getcelldata("Adactin", 1, 6), element7);
//	
//	WebElement element8= locatorbyid("datepick_out");
//	elementSendKeys(getcelldata("Adactin", 1, 7), element8);
//	
//	WebElement element9 = locatorbyid("adult_room");
//	elementDdnText(element9, getcelldata("Adactin", 1, 8));	
//	
//	WebElement element10 = locatorbyid("child_room");
//	elementDdnText(element10, getcelldata("Adactin", 1, 9));
//	
//	WebElement element11 =locatorbyid("Submit");
//	elementClick(element11);
//	sleep();
// }
	
    @Parameters({"usernme","data"})
    @Test
    public void print(String usernme,String data) {
    	System.out.println(usernme);
    	System.out.println(data);
    }
    
 
//	driver.findElement(By.id("radiobutton_1")).click();
//	driver.findElement(By.id("continue")).click();
//	Thread.sleep(6000);
//	
//	driver.findElement(By.id("first_name")).sendKeys("mnj");
//	driver.findElement(By.id("last_name")).sendKeys("kumar");
//	
//	driver.findElement(By.id("address")).sendKeys("3/1888,rmd");
//	driver.findElement(By.id("cc_num")).sendKeys("5555555555552222");
//	
//	WebElement element7 = driver.findElement(By.id("cc_type"));
//	Select select6 = new Select(element7);
//	select6.selectByIndex(1);
//	
//	WebElement element8 = driver.findElement(By.id("cc_exp_month"));
//	Select select7 = new Select(element8);
//	select7.selectByIndex(2);
//	
//	
//	WebElement element9 = driver.findElement(By.id("cc_exp_year"));
//	Select select8 = new Select(element9);
//	select8.selectByIndex(2);
//	
//	
//	driver.findElement(By.id("cc_cvv")).sendKeys("234");
//	driver.findElement(By.id("book_now")).click();
//	
//	Thread.sleep(3000);
//	
//	WebElement my_itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
//	my_itinerary.click();
//	
//	Thread.sleep(3000);
	
}	
