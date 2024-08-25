package week2.day4;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader Mode enable");
	}
	public void fullScreenMode() {
		System.out.println("The browser is in FullscreenMode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Safari sa= new Safari();
		sa.readerMode();
		sa.fullScreenMode();
		sa.openUrL();
		sa.navigateBack();
		sa.closeBrowser();
		System.out.println("Browsername:"+sa.browserName);
		System.out.println("Browserversion:"+sa.browserVersion);
	}

}
