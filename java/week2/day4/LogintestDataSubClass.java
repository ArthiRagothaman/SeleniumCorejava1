package week2.day4;

public class LogintestDataSubClass extends TestDataSuperClass {
	public void enterUsername() {
		System.out.println("Enter Username:");
		
	}
	public void enterPassword() {
		System.out.println("Enter Password:");
		
	}

	public static void main(String[] args) {
		
		LogintestDataSubClass sub = new LogintestDataSubClass();
		sub.enterUsername();
		sub.enterPassword();
		//superclass method
		sub.enterCredentials();
		sub.navigateToHomePage();
		
	}

}
