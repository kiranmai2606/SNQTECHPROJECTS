package tasks;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) 
	{
		//Integer array
		//asList
			int arr1[]= {10,40,30,20,50}; 
			int arr2[]= {100,99,98,97,96,95,94,94};
			//To access each element in the array 
			 System.out.println(arr1[0]);
			 int secondelement =arr1[1];
			 System.out.println(secondelement);
			 System.out.println(Arrays.asList(arr1)); //Doubt1 
			 System.out.println("Before sort");
			 System.out.println(Arrays.toString(arr1));//toString
			 Arrays.sort(arr1);//sort
			 System.out.println("After sort");
			 System.out.println(Arrays.toString(arr1));//toString
			 System.out.println(Arrays.compare(arr1, arr2));//compare
			 System.out.println(Arrays.equals(arr1, arr2));//equals
			 
		 
			 
}

		

		

		

		
		  
	}


