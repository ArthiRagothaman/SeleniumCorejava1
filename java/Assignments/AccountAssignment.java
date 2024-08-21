package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step1 Intialize the driver
		ChromeDriver driver=new ChromeDriver();
		//step2 maximize the window
		driver.manage().window().maximize();
		//step 3 load the URL
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(8000);
		
		//Login credentials
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(6000);
		//Accounts section
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		//create Account section
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ArthiRS");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("6");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		
		//Title displayed
		String title = driver.getTitle();
        if(title.contains("Account Details"))
        {
       	 System.out.println("Account created successfully");
        }
        else {
       	 System.out.println("Not Successful");
       	 
        }
		driver.close();
		
		
	}

}
