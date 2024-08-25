package Assignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input string
		String test = "changeme";
		//Convert the string to character Array
		char[] charArray = test.toCharArray();	
		//System.out.println(charArray);
		//Iterate the array length 
		for(int i=charArray.length-1;i>=0;i--) {
			//Check the Odd index value
			if(i%2!=0) {
				//Convert character oddIndex to Upper case
				charArray[i]=Character.toUpperCase(charArray[i]);			
			}
		}
		//Convert character to string
		 String result = new String(charArray);
		 System.out.println("Output result OddIndexUppercase is: " +result);
	}

}
