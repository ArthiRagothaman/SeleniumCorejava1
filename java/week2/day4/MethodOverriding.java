package week2.day4;

public class MethodOverriding extends MethodOverloading1 {
	
	public void takeSnap(String msg,String status) {
		System.out.println("Taking snap method: "+msg);
		
	}

	public void reportStep(String msg,String status) {
		System.out.println("Now my method become override: "+status);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding ov1= new MethodOverriding();
		ov1.takeSnap("msg","done");
		ov1.reportStep("Method Overide","Successfully done");
			
	}

}
