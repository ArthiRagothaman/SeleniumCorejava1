package week2.day4;

public class MethodOverloading1 {
	
	public void takeSnap(String msg,String status) {
		System.out.println("Report setup: "+msg);
		
	}

	public void reportStep(String msga, String status1, boolean snap  ) {
		System.out.println("Report values: "+msga);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MethodOverloading1 ov1= new MethodOverloading1();
		//ov1.reportStep("Hello", "Welcome");
		//ov1.reportStep("Hi","Method",true);
						
	}

}
