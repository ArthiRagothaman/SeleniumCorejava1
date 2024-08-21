package prime;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int num = 14;
				int count = 0;
				
				for(int i = 1; i<=num; i++) {
					if(num%i==0) {
						count++;
					}
				}
				
				if(count==2) {
					System.out.println("Given Nume Is Prime");
				}
				else {
				
				System.out.println("Given Number Is not Prime");
				}
	}
}


		

	


