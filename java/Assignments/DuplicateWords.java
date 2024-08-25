package Assignments;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String res = "";
		String[] split = text.split(" ");
		//split={we,learn,java,basics,as,part,of,java,sessions,in,java,week1}
		
		// Iterate through the words array
		for (int i = 0; i < split.length; i++) {
		    boolean isDuplicate = false;

		    // Compare the current word with all previous words
		    for (int j = 0; j < i; j++) {
		        // Case-insensitive comparison
		        if (split[i].equalsIgnoreCase(split[j])) {
		            isDuplicate = true;
		            break;
		        }
		    }

		    // If the word is not a duplicate, add it to the result string
		    if (!isDuplicate) {
		        if (!res.isEmpty()) {
		            res += " "; // Add space between words
		        }
		        res += split[i];
		    }
		}

		// Print the result
		System.out.println(res);
	}
}

		          
	



       


