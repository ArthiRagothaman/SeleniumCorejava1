package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		
		//return type-findElements -List<WebElement>
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int size = elements.size();
		System.out.println("Total link: "+size);
		
		//print particular index
		//String text = elements.get(1).getText();
		//System.out.println(text);
		
		
		//Print the text presented inside a tag
		for(int i=0; i<elements.size();i++) {
			String text2 = elements.get(i).getText();
			System.out.println(text2);
			
		}
		 driver.close();
	}
 
	  
}
