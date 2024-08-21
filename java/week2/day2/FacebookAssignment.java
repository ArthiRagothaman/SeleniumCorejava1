package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
           
		 //driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		WebElement element = driver.findElement(By.linkText("Create new account"));
		//Js script - If we couldn't load the page have to use this below line of code
		driver.executeScript("arguments[0].click()", element);

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654321");
		//driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Hello@123");
		driver.findElement(By.id("password_step_input")).sendKeys("Hello@123");
		
		 //DropDown Menu Date of Birth
		 WebElement day1 = driver.findElement(By.id("day"));
		
		   Select menu1 = new Select(day1);
		   menu1.selectByVisibleText("29");
		  
		   WebElement month1 = driver.findElement(By.id("month"));
		   Select menu2 = new Select(month1);
		   menu2.selectByVisibleText("Dec");
		   
		  WebElement year1 = driver.findElement(By.id("year"));
		  Select menu3 = new Select(year1);
		  menu3.selectByVisibleText("1996");
		
		 
		  driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		 
		  driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		  
		  driver.close();
		
	}

}
