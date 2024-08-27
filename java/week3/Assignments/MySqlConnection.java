package week3.Assignments;

public abstract class MySqlConnection implements DatabaseConnection {
	public void executeQuery() {
		System.out.println("Execute query in MySqlconnection abstract class");
		
	}
	abstract void sqConnection();
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
