package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the chromedriver
		ChromeDriver driver=new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//To load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Login-Testleafsite credentials
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(6000);
		
		//Lead section
		
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			Thread.sleep(2000);
			
		
		//Create Lead section
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumTestLeaf");
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(3000);
			
			
		//Title displayed
			String title = driver.getTitle();
			if(title.contains("View Lead"))
			{
				System.out.println("Title displayed successfully");
			}
			else
			{
				System.out.println("Title not displayed");
			}
				
		
          driver.close();
	}

}
