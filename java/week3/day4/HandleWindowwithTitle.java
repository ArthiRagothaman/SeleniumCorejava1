package week3.day4;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowwithTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		   //driver.quit();
		   // how many child browser are opened 
		   Set<String> anotherChild = driver.getWindowHandles();
		   System.out.println(anotherChild);
		   
		   
		   //Set title page which i need to handle
		   String childWindowTitle ="Web Table";
		   
		   //iterate through all windows with for loop
		   for (String s : anotherChild) {
			   driver.switchTo().window(s);
			   
			   //check the title of the window
			   if(driver.getTitle().contains(childWindowTitle)) {
				   String currentUrl = driver.getCurrentUrl();
				   System.out.println(currentUrl);
				   driver.manage().window().maximize();
				   driver.close();
			   }  
		}
		   
		   //it will back to main window
		   driver.switchTo().defaultContent();
	}

}
