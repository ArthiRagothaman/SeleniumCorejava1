package week3.day2;
import java.util.HashSet;


public class LearnSet {

	public static void main(String[] args) {
	String[] mentors= {"Vinoth","Vineeth","Bhuvanesh","Vineeth","Sakthi","Bhuvanesh"};

		Set<String> unq=new TreeSet<String>();

		for (String s : mentors)
			{
			
			unq.add(s);
			}

		System.out.println(unq);

		//set - we not have sort method 
		//we can use TreeSet

		//convert set into list
		List<String> val=new ArrayList<String>(unq);
		String string = val.get(2);

		System.out.println(string);

		// remove duplicate char from the string

		String name="testleaf";

		//convert into toCharArray
		char[] ch = name.toCharArray();

		//empty set
		Set<Character> unq1=new LinkedHashSet<Character>();

		for (Character c : ch) {
			unq1.add(c);
		}

		System.out.println(unq1);

		//set value and iteration into character

		for (Character character : unq1) {
			System.out.print(character);
		}	

	}				

	}


