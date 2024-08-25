package week2.day4;

public class ChromiumDriver extends RemoteWebDriver {
	
	public void chrome() {
		
		System.out.println("Its coming from chrome driver driver()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromiumDriver dr = new ChromiumDriver();
		dr.chrome();
		dr.remote();
		

	}

}
