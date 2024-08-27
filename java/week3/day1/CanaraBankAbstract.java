package week3.day1;

public abstract class CanaraBankAbstract implements PaymentsInterface {
	
	public void recordPaymentDetails() {
		System.out.println("Payment details recorded");
	}

	 abstract void bankTransaction();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
