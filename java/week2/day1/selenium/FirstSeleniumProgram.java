package week2.day1.selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1	
		ChromeDriver driver=new ChromeDriver();
		
		//step2 max the screen
		driver.manage().window().maximize();
		
		//step 3 To load the url have to use get method
		driver.get("http://www.facebook.com");
		
		// step 4 to close the browser
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();


	}

}
