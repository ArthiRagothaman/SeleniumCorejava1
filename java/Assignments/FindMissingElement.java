package Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {1,4,3,2,8,6,7};
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]+1!=num[i+1]) {
				 for (int j = num[i] + 1; j < num[i + 1]; j++) {
					 System.out.println("The Missing value is: "+j); 
				 }
				
			}
		}
	}

}
