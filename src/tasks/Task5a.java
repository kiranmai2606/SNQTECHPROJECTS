package tasks;

import java.util.Arrays;

public class Task5a {

	public static void main(String[] args) {
		// string array 
		 String arr1[]= {"201","Kiranmai","Java","A"};
		 String arr2[]= {"202","Kiran","Selenium","B","p","Tenali"};
		 String arr3[]= {"201","Kiranmai","Java","A"};
		    System.out.println(Arrays.asList(arr1));//asList
			System.out.println(Arrays.toString(arr1));//tostring
			System.out.println(Arrays.equals(arr1, arr2));//equals 
			System.out.println(Arrays.equals(arr1, arr3));
			System.out.println(Arrays.compare(arr1, arr2));//compare
			System.out.println(Arrays.compare(arr1, arr3));//compare
			Arrays.sort(arr1);
			System.out.println("After sort");
			System.out.println(Arrays.toString(arr1));//sort 
 
	}

}
