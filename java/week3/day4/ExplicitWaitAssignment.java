package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.leafground.com/window.xhtml");
		   driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		   WebDriverWait wed = new WebDriverWait(driver,Duration.ofSeconds(30));
		   Boolean until = wed.until(ExpectedConditions.numberOfWindowsToBe(3));
		   System.out.println(until);
		   driver.quit();
	}

}
