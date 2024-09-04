package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAutomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		// Search product details
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//First product information
		String refurbishedOnePlus = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).getText();
		System.out.println("Name of the Product:" +refurbishedOnePlus);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first product:" +text);
		String text2 = driver.findElement(By.xpath("//span[contains(@class,'a-size-base s-underline-text')]")).getText();
		System.out.println("Number of customer ratings:" +text2);
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		//Window handle- To get first particular product details 
		Set<String> windowHandles = driver.getWindowHandles();
	    Thread.sleep(1000);
	    List<String> childPage = new ArrayList<String>(windowHandles);
	   driver.switchTo().window(childPage.get(1));
	   //Not working screenshot-disc img corrupted
	   //How to take screenshot-Step1
	   File screenshot = driver.getScreenshotAs(OutputType.FILE);
	   //Set path to store the image
	   File des= new File("./snaps/phonepicture4.png");
	   //step3- combine step1 and step 2
	   FileUtils.copyFile(screenshot, des);
	   
	   //  Adding product to cart
	   driver.findElement(By.id("add-to-cart-button")).click();
	   Thread.sleep(2000);
	   //Subcart price details
	   String cartSubtotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
	   Thread.sleep(2000);
	   System.out.println("Subcart total: "+cartSubtotal);
	   driver.close();
	   driver.quit();
	  
	}

}
