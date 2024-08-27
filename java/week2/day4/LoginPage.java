package week2.day4;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Base Page  is Overrided in Login page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp= new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		//Override from baspage
		lp.performCommonTasks();

	}
}
