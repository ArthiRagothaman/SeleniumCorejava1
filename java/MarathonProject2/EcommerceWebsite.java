package MarathonProject2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EcommerceWebsite {

	public static void main(String[] args) throws InterruptedException, IOException {
		//To disbale notifications
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		//To Refresh the page
		driver.navigate().refresh();
		Thread.sleep(6000);
		//2. MouseHover on 'Brands'
		//MouseOver on Brands
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Thread.sleep(1000);
		//Actions
		Actions ob = new Actions(driver);
		ob.moveToElement(brands).perform();
		Thread.sleep(1000);
		//3. MouseHover on 'Watches & Accessories'
		//MouseOver on Watches&Accessories
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		//Actions
		Actions ob1 = new Actions(driver);
		ob1.moveToElement(watch).perform();
		Thread.sleep(2000);
		//4. Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//5. Select sort by: New Arrivals
		
		driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']//select[@class='SelectBoxDesktop__hideSelect']")).click();
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']//option[text()='New Arrivals']")).click();
		/*
		WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']//option[text()='New Arrivals']"));
		Thread.sleep(2000);
		// Create an instance of Select class and select "New Arrivals"
		Select sortBy = new Select(sortby);
		sortBy.selectByVisibleText("New Arrivals");
		*/
		Thread.sleep(1000);
		System.out.println("New Arrivals sorted");
		//6. choose men from categories filter.
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckboxBlock']//div[@class='FilterDesktop__newFilName']")).click();
		System.out.println("Category Men is selected");
		//7. print all price of watches
		//Getting the whole price using List
		List<WebElement> priceList = driver.findElements(By.className("ProductDescription__priceHolder"));
		int PriceListSize = priceList.size();
		System.out.println("Total PriceLists:"+PriceListSize);
		for(WebElement p: priceList) {
			String text = p.getText();
			System.out.println(text);
		}	
		driver.findElement(By.className("ProductModule__dummyDiv")).click();
		Thread.sleep(1000);
		//8. click on the first resulting watch
		//To handle Multiple Windows- getWindowhandles
		Set<String> windowHandles = driver.getWindowHandles();
		Thread.sleep(1000);
		   //convert set into list
		   List<String> child = new ArrayList<String>(windowHandles);
		   Thread.sleep(1000);
		  driver.switchTo().window(child.get(1));
		  String title = driver.getTitle();
		  System.out.println("ChildWindow Title:"+title);  
		  //9. click Add to Bag   and  get count from the Bag cart icon.
		  driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		  String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		  System.out.println("Price count: "+text);
		  Thread.sleep(3000);
		  //11. Click on the Bag cart icon
			 driver.findElement(By.className("DesktopHeader__myBagShow")).click();
			//10. compare two price are similar
		// Getting the price from the watch details
		 String text2 = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__textWithOutOfStock']"
		 		+ "//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
		 Thread.sleep(2000);

		 // Getting the price from the cart
		 String text3 = driver.findElement(By.xpath("//div[@class='DesktopCheckout__info DesktopCheckout__label']")).getText();
		 Thread.sleep(1000);
		 // Use .equals() method to compare the two strings
		 if(text2.equals(text3)) {
		     System.out.println("Prices are equal");
		 } else {
		     System.out.println("Prices are not equal");
		 }
		 //12. Take a snap of the resulting page. 
		//How to take screenshot-Step1
		   File screenshot = driver.getScreenshotAs(OutputType.FILE);
		   //Set path to store the image
		   File des= new File("./snaps/cartpicture.png");
		   //step3- combine step1 and step 2
		   FileUtils.copyFile(screenshot, des); 
		 driver.switchTo().defaultContent();
		 driver.quit();
		 
	}

}
