package week2.day4;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println(" Snapshot for Edge browser");
	}
  public void clearCookies() {
	  System.out.println("Clear cookies");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge ed= new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.openUrL();
		ed.navigateBack();
		ed.closeBrowser();

	}

}
