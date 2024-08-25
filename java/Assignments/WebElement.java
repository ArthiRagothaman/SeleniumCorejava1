package Assignments;

public class WebElement {
	//click()Method
	public void click() {
	
		System.out.println("WebElement is clicked");	
	}
	//setText() Method
	public void setText(String text) {
		System.out.println("Getting the Text: "+text);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for above setText()Method
		WebElement ele= new WebElement();
		ele.setText("WebElement is the Baseclass");
		
	}

}
