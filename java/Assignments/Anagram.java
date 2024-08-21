package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
        String text2 = "potss";

        // Check if the lengths of the two strings are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
           
        }

        // Convert the strings to character arrays
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();

        // Sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }

	}

}
