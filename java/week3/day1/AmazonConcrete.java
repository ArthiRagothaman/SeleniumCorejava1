package week3.day1;

public class AmazonConcrete extends CanaraBankAbstract  {
	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cash on delivery");	
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment method UPI");	
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payments only with card");	
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking");	
	}
	
	@Override
	void bankTransaction() {
		// TODO Auto-generated method stub	
		System.out.println("Transactio details Updated");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmazonConcrete ac = new AmazonConcrete();
		ac.recordPaymentDetails();
		ac.cardPayments();
		ac.internetBanking();
		ac.upiPayments();
		ac.bankTransaction();
	}

	

	

}
