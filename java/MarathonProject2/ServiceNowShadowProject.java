package MarathonProject2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNowShadowProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");	
		//2. Login with valid credentials username as admin and password 
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		//3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		//Shadow dom project
		Thread.sleep(1000);
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(15);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		System.out.println("Service catalog clicked");
		//4. Click on  mobiles
		WebElement elementByXPath = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elementByXPath);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		System.out.println("Mobile link is clicked");
		//5. Select Apple iphone13pro
		//driver.findElement(By.xpath("//a[@class='service_catalog']//h2[text()='Apple iPhone 13 pro']")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		System.out.println("Apple iphone 13Pro clicked");
		//6. Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[@class='radio-label']")).click();
		System.out.println("Replacement for a lost Iphone Yes clicked");
		//7. Enter Phone Number
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("9876543210");
		//7. Select Unlimited from the dropdown in Monthly data allowance
		
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")); 
	
		new Select(element).selectByValue("unlimited"); 
		
		System.out.println("Unlimited option selected");
		
		//8. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='Sierra Blue']")).click();
		System.out.println("Colou SierraBlue is selected");
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[@class='radio-label']")).click();
		System.out.println("Storage option 512GB selected");
		
		//9. Click on Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		System.out.println("Order Now button is clicked");
		
		//Notifications are displayed after ordered 
		String thankYou = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println("Thank you Notifications: "+thankYou);
		//10. Verify order is placed and copy the request number
		String rEQ = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']//b[1]")).getText();
		System.out.println("RequestNumber: "+rEQ);
		//11.Take a Snapshot of order placed page   
				//How to take screenshot-Step1
				   File screenshot = driver.getScreenshotAs(OutputType.FILE);
				   //Set path to store the image
				   File des= new File("./snaps/orderpage.png");
				   //step3- combine step1 and step 2
				   FileUtils.copyFile(screenshot, des); 
				   driver.close();

	}


}
