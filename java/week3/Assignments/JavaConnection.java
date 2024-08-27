package week3.Assignments;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection Enabled in Interface");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Connecion become disconnected in Interface");
		
	}

	//Abstract class Methods
	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Connection is Updated and execution in Interface");
		
	}
	//Abstract class Method with abstract keyword
	@Override
	void sqConnection() {
		System.out.println("Abstract class method");
		
	}

	public static void main(String[] args) {

		JavaConnection jc = new JavaConnection();
		//Interface methods
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		//Abstract 
		jc.executeQuery();
		jc.sqConnection();
		
		
		

	}

}
