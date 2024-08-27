package week2.day4;

public class TestDataSuperClass {
	
	public void enterCredentials() {
		System.out.println("Enter the Credentials:");
		
	}
	public void navigateToHomePage() {
		System.out.println("Navigate back to Home Page");
	}

	public static void main(String[] args) {
		
		TestDataSuperClass data = new TestDataSuperClass();
		data.enterCredentials();
		data.navigateToHomePage();

	}

}
