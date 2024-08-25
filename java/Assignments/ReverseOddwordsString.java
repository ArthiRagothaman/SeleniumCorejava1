package Assignments;

public class ReverseOddwordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String[] text = test.split(" ");
		String result = " ";
		
		// Traverse the array of words
        for (int i = 0; i < text.length; i++) {
            if (i % 2 != 0) {
                // Reverse the word at odd index and append it to result
                for (int j = text[i].length() - 1; j >= 0; j--) {
                    result += text[i].charAt(j);
                }
            } else {
                // Append the word at even index to result
                result += text[i];
            }
            // Add a space after each word
            result += " ";
        }
        
        // Print the result, trim to remove the trailing space
        System.out.println(result.trim());
	}

}
