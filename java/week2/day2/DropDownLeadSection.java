package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLeadSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Initialize the ChromeDriver
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
					//driver.findElement(By.xpath("//*[@href=\"/crmsfa/control/leadsMain\"]")).click();
					driver.findElement(By.linkText("Leads")).click();
					
					Thread.sleep(2000);
					
				
				//Create Lead section
					//driver.findElement(By.xpath("//*[@href=\"/crmsfa/control/createLeadForm\"]")).click();
					driver.findElement(By.linkText("Create Lead")).click();
					
					driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
					/*
					driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumTestLeaf");
					driver.findElement(By.className("smallSubmit")).click();
					Thread.sleep(3000);
					*/
				//Drop-Down Menu
					
					WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
					
				//object Select
					Select obj= new Select(source);
				//SelectBYValue
					obj.selectByIndex(5); 
					WebElement markcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
					Select obj1 = new Select(markcamp);
					obj1.selectByVisibleText("Automobile");
					
					WebElement curr = driver.findElement(By.id("createLeadForm_currencyUomId"));
					Select obj2 = new Select(curr);
					obj2.selectByVisibleText("KPW - North Korean Won");
					driver.findElement(By.className("smallSubmit")).click();
					Thread.sleep(4000);
					//driver.close();
	}

}
