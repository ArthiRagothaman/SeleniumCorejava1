package week1.day1;

public class Chrome {
	
	public int releaseYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chrome = new Chrome();
		chrome.releaseYear = 2008;
		float version = 91.0f;
		boolean isBeta= false;
		char shortCutKey='C';

		System.out.println("Release Year: " +chrome.releaseYear +"\n" +
				            "Version: " + version +"\n" +
				             "Beta Value: " +isBeta +"\n" +
				              "ShortCutKey Chrome: " + shortCutKey);
	}

}
