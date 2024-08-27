package week3.day1;

public interface Interface {
	//Implement 2 methods above java 1.7 version
	//static keyword- common reference here
	public static void webElement() {
		
	}
	//static- no need to create object for it
	//interfaceName.methodname()
	// it will not break existing implementation
	
	default void click() {
		
	}
 
	
}
