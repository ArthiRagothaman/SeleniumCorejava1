package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		//LoginPage details
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM/SFA Page
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		//Account Section
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ArthiRSAS");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//DropDownMenu
		
		WebElement source1 = driver.findElement(By.name("industryEnumId"));
		Select obj1= new Select(source1);
		obj1.selectByVisibleText("Computer Software");
		
		WebElement source2 = driver.findElement(By.name("ownershipEnumId"));
		Select obj2= new Select(source2);
		obj2.selectByVisibleText("S-Corporation");
		
		WebElement source3 = driver.findElement(By.id("dataSourceId"));
		Select obj3= new Select(source3);
		obj3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement source4 = driver.findElement(By.id("marketingCampaignId"));
		Select obj4= new Select(source4);
		obj4.selectByIndex(6);
		
		WebElement source5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj5= new Select(source5);
		obj5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
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
