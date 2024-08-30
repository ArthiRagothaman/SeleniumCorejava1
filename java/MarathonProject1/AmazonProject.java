package MarathonProject1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

	public static void main(String[] args) throws InterruptedException {	
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.amazon.in/");
      
      WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
      element.sendKeys("bags for boys",Keys.ENTER);
      Thread.sleep(2000);
      //List out the results 
     String element2 =  driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
     System.out.println("The Results are: "+element2 +" "+"bag for boys");
     Thread.sleep(2000);
     //Brands section
     //First Brand
     driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='American Tourister']")).click();
    System.out.println("FirstBrand Selected");
    //Second brand
    driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='Skybags']")).click();
    System.out.println("Second Brand Selected");
    // Locate the "Sort by" dropdown using XPath
    WebElement sortByDropdown = driver.findElement(By.xpath("//span[@class='a-dropdown-container']//select[@id='s-result-sort-select']"));
    Thread.sleep(2000);
    // Create an instance of Select class and select "Newest Arrivals"
    Select sortBy = new Select(sortByDropdown);
    sortBy.selectByVisibleText("Newest Arrivals");
    Thread.sleep(2000);
    //Get FirstBag information
    String stringLCasual = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
    System.out.println("Information: "+stringLCasual); 
    //Price
    String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
    System.out.println("Price details:"+price);
    //Page Title
    String title = driver.getTitle();
    System.out.println("Title of the Page: "+title);
    driver.close();

   
 
     
   
     
   
  
    
    
     
    
   
     //WebElement element4 = driver.findElement(By.xpath("//a[@class='a-dropdown-link'])[4]"));
     //element4.click();
     //System.out.println(element4);

     
   
     
      
	}

}
