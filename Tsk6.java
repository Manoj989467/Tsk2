package org.booking;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tsk6  extends Base{

		public static void main(String[] args) throws InterruptedException {
			
			Tsk6 tsk6 = new Tsk6();
			tsk6.price();
		}
			
		public void price() throws InterruptedException {

			WebDriver driver;
			driver = new EdgeDriver();
			driver.get("https://omrbranch.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.id("email")).sendKeys("manoj.m0399@gmail.com");
			
			
			driver.findElement(By.id("pass")).sendKeys("Manoj@1313");
				
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement state = driver.findElement(By.id("state"));
			elementDdnIndex(state, 5);

			WebElement city = driver.findElement(By.id("city"));
			elementDdnIndex(city, 1);

			WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type[]']"));

			Select room = new Select(roomtype);

			List<WebElement> options = room.getOptions();

			for (WebElement webElement : options) {
				String text = webElement.getText();
				if (text.equals("Room Type")) {
					continue;
				} else {
					room.selectByVisibleText(text);
				}
			}
				driver.findElement(By.xpath("//input[@name='check_in']")).click();
				

				driver.findElement(By.xpath("//a[.='15']")).click();

				driver.findElement(By.xpath("//input[@name='check_out']")).click();

				driver.findElement(By.xpath("//a[.='16']")).click();

				WebElement no_of_rooms = driver.findElement(By.id("no_rooms"));
				elementDdnIndex(no_of_rooms, 2);

				WebElement no_adults = driver.findElement(By.id("no_adults"));
				elementDdnIndex(no_adults, 2);

				WebElement no_child = driver.findElement(By.id("no_child"));
				no_child.sendKeys("1");

				WebElement frmeswitch = driver.findElement(By.id("hotelsearch_iframe"));
				driver.switchTo().frame(frmeswitch);

				WebElement search_button = driver.findElement(By.id("searchBtn"));
				search_button.click();

				Thread.sleep(3000);

				driver.findElement(By.xpath("//label[.='Price low to high']")).click();
				Thread.sleep(3000);

				List<WebElement> elements = driver.findElements(By.xpath("//strong[contains(text(),'$')]"));
				List<String> price = new ArrayList<>();

				for (WebElement webElement1 : elements) {
					String price1 = webElement1.getText();
					String substring = price1.substring(1);
					String replace = substring.replace(",", "");
					price.add(replace);
				}
				System.out.println(price);

				List<String> price2 = new ArrayList<>();
				price2.addAll(price);

				Collections.sort(price2);
				System.out.println(price2);
				boolean equals = price2.equals(price);
				if (equals) {
					System.out.println("order is correct");
				} else {
					System.out.println("order is wrong");
				}

			}
}
