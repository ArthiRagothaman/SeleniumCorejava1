package week2.day4;

public class APIClient {
	//Method Overloading
	public void sendRequest(String endpoint) {
	
		System.out.println("Endpoint request: "+endpoint);
		
	}
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		
		System.out.println("Client Requested with values: " +endpoint + "\t" +requestBody +"\t"+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient client= new APIClient();
		client.sendRequest("Requested endpoint successfully");
		client.sendRequest("Request","key",false);		
	}

}
