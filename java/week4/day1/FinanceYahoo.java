package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");
		//Table- Crypto tab
		driver.findElement(By.linkText("Crypto Heatmap")).click();
		//To Fetch no.of rows -- FindElements
		 List<WebElement> rowValue = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr"));
		 int size = rowValue.size();
		System.out.println("Row count: "+size);
		//To fetch no. of columns
		 List<WebElement> colValue = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr[1]/td"));
		 int size2 = colValue.size();
		 System.out.println("Column count: "+size2);
		 
		 //To fetch crypto currency names using for loop
		 /*
		 //Approach1
		 for (int i = 1; i <=size; i++) {
				String text = driver.findElement(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(text);
			
		}
		*/
		 //Approach 2
		 List<WebElement> currencyNames = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr/td[1]"));

		 for (WebElement name : currencyNames) {
		     System.out.println(name.getText());
		 }
		 driver.close();
	}
	

}
