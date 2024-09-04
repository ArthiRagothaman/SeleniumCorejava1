package week3.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(1000);
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Window handles for From Contact & To Contact
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		// Change to Set to  handle  multiple window
		Set<String> windowHandles = driver.getWindowHandles();
	    Thread.sleep(1000);
	    //Convert Set into List
	    
		List<String> windowList=new ArrayList<String>(windowHandles);
		String parentWindow = windowList.get(0);
	
		String childWindow = windowList.get(1);
		//switch to childwindow
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle()); // Child Window title
		
		//Get the first result details from child window
		
		driver.findElement(By.className("linktext")).click();
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//use Set to get the child window
		Set<String> windowHandles2 = driver.getWindowHandles();
		Thread.sleep(1000);
		//Again convert Set into list to get particular window details
		List<String> windowList2= new ArrayList<String>(windowHandles2);
		String childWindow2 = windowList2.get(1);
		driver.switchTo().window(childWindow2);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(parentWindow);
		//Merge both child window details
		driver.findElement(By.linkText("Merge")).click();
		//Alert 
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		Thread.sleep(1000);
	    //Title of the page 
		System.out.println(driver.getTitle());
		
		driver.close();
		
	
		

	}

}
