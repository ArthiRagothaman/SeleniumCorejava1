package week2.day1.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1	
		ChromeDriver driver=new ChromeDriver();	
		//step2 max the screen
		driver.manage().window().maximize();
		//step 3 To load the url have to use get method
		driver.get("https://www.facebook.com/");
		
		// step 4 to close the browser
	   // try {
		//	Thread.sleep(10000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//driver.close();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		Thread.sleep(10000);
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
         if(title.contains("facebook"))
         {
        	 System.out.println("Login Successful");
         }
         else {
        	 System.out.println("Login not Successful");
        	 driver.close();
         }
         
		 
	}

}
