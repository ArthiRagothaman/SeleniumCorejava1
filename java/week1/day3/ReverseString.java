package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Arthi";
		char[] charArray = name.toCharArray();
		System.out.print("The Reverse String is: ");
		for(int i=charArray.length-1;i>=0;i-- ) {
			System.out.print(charArray[i]);
		}

	}

}
