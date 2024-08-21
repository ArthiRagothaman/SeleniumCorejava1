package Assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			{  
			 int n1=0,n2=1,n3,i,count=8;  
			 System.out.println(n1);
			 System.out.println(n2);//printing 0 and 1  
			  
			 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed  
			 {  
			  n3=n1+n2;  
			  System.out.println(n3);  
			  n1=n2;  
			  n2=n3;  
			 }  

			}}

	}


