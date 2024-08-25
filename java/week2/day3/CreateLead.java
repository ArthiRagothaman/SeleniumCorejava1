package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("DemoCsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("name");
		System.out.println(firstName);
		
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SSA");
		driver.findElement(By.name("submitButton")).click();
		
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);
		
		if(name.equalsIgnoreCase("arthi")) {
			System.out.println("lead created ");
		}else {
			System.out.println("lead is not created");
		}
		
		//driver.close();
		//another method for driver.close()
		driver.quit();

	}

}
