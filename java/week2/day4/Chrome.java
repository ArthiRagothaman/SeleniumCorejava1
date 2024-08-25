package week2.day4;

public class Chrome extends Browser {
	
	public void openIcognito() {
		System.out.println("The browser mode is icognito openIcognito()");
	}
	public void clearCache() {
		System.out.println("The cache become cleared clearCache()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ch = new Chrome();
		ch.openIcognito();
		ch.clearCache();
		ch.openUrL();
		ch.closeBrowser();
		ch.navigateBack();
		

	}

}
