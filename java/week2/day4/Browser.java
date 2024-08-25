package week2.day4;

public class Browser {
	
	String browserName="FireFox";
	int browserVersion=10;
	
	public void openUrL() {
		System.out.println("The browser URL opened openURL()");	
	}
	public void closeBrowser() {
		System.out.println("The Browser is closed closeBrowser()");
	}
	public void navigateBack() {
		System.out.println("Browser getting navigated back navigateback()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br = new Browser();
		br.openUrL();
		br.closeBrowser();
		br.navigateBack();

	}

}
