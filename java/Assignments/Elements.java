package Assignments;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Textfield sub-class
		TextField txtfield= new TextField();
		txtfield.getText();
		
		//Checkbox button subclass
		CheckBoxButton chkbox = new CheckBoxButton();
		chkbox.clickCheckButton();
		
		//Elements Execution class
		Elements element= new Elements();
		element.submit();
		element.click();
		element.setText("Elements is execution class ");
		
	}

}
