package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitInvisibity {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://leafground.com/waits.xhtml");
		   
		   driver.findElement(By.xpath("//span[text()='Click'])[2]")).click();
		   WebElement element = driver.findElement(By.xpath("//span[contains(text(),'I am about to hide')]"));
		   WebDriverWait wed= new WebDriverWait(driver,Duration.ofSeconds(5));
		   Boolean until = wed.until(ExpectedConditions.invisibilityOf(element));
		   System.out.println(until);
		   
		   
	}

}

