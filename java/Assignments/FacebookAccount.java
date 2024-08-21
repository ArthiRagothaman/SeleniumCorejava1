package Assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {
		//Initialize the web driver
		ChromeDriver driver = new ChromeDriver();
		//Loaded the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.linkText("Create new account")).click();
		//Enter username and password
		driver.findElement(By.name("firstname")).sendKeys("Arthi");
        driver.findElement(By.name("lastname")).sendKeys("R");
        driver.findElement(By.name("reg_email__")).sendKeys("7010494238");
        driver.findElement(By.id("password_step_input")).sendKeys("At2332@#er");
        
        WebElement day = driver.findElement(By.id("day"));
        Select s1 = new Select(day);
        s1.selectByVisibleText("2");
        
        WebElement month = driver.findElement(By.id("month"));
        Select s2 = new Select(month);
        s2.selectByValue("6");
        
        
        WebElement year = driver.findElement(By.id("year"));
        Select s3 = new Select(year);
        s3.selectByIndex(25);
        
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.name("websubmit")).click();
        

	}

}



	

