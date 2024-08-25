package week2.day4;

public class MethodOverloading {
	public void startApp(String url) {
		// TODO Auto-generated method stub
		System.out.println("URL: "+url);

	}
	public void startApp(String browser,String url) {
		// TODO Auto-generated method stub
		System.out.println("BrowserName: "+browser +"\n" +"URL: "+url);

	}
	public void startApp(int noOfBrowser) {
		// TODO Auto-generated method stub
		System.out.println("Number of Browser opened: "+noOfBrowser);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mo = new MethodOverloading();
		mo.startApp("www.google.com");
		mo.startApp("Chrome Browser", "platform.testleaf.com");
		mo.startApp(5);
	}

}
