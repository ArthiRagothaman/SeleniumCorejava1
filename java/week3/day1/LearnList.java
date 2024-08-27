package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mentors = new ArrayList<String>();
		mentors.add("bhuvanesh");
		mentors.add("vinoth");
		mentors.add("xxxx");
		mentors.add("yyyy");
		mentors.add("ggggg");
		System.out.println("Mentors list: "+mentors);
		List<Integer> value = new ArrayList<Integer>();
		
		int[] age = {20,10,30,41,55,65,77};
		
		//list index value start from 0
		mentors.add(2,"zzzz");
		System.out.println("Print mentor list after adding 2nd position"+mentors);
		
		//size
		int mentorSize = mentors.size();
		System.out.println("length of the list :"+mentorSize);
		//contains
		boolean contains = mentors.contains("vinoth");
		System.out.println(contains);
		
		//remove
		String remove = mentors.remove(2);
		System.out.println(remove);
		
		//get
		String string = mentors.get(4);
		System.out.println(string);
		
		//sorting
		Collections.sort(mentors);
		System.out.println("After sorting the list "+mentors);
		
		//collection list and set
		//foreach loop
		for (int i : age) {
			
			
		}
		
		//clear
		//will clear all datas will be deleted
		mentors.clear();

	}

}
