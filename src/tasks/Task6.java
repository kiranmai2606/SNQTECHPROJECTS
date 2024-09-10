package tasks;

public class Task6 {

	public static void main(String[] args) 
	{
		//one dimensional array
		int arr[]= {10,20,30,40,50};
		String str[]= {"kiranmai","Tenali","522201","AK"};
	
		System.out.println("Integer array length" +arr.length);	//Finding length of an array
		System.out.println("string array length"  +str.length);	//Finding length of an array
		
		System.out.println("Elements in Interger array ");
 
		 for (int i=0;i<arr.length ;i++)
		  {
			 
			  System.out.print(arr[i] + " ");// For printing array elements 
		  }
		 System.out.println("\nReverse Integer array ");
		 for(int j=arr.length-1 ;j>=0; j--)
		 {
		  // Reverse array elements 
			 System.out.print(arr[j] + " ");
		 }  
		System.out.println("\nElements in string array ");
		 for (int i=0;i<str.length ;i++)
		  {
			 
			 System.out.print(str[i] + " ");// For printing array elements 
		  }
		
		 System.out.println("\nReverse String array ");
		 for(int j=str.length-1 ;j>=0; j--)
		 {
		  // Reverse array elements 
			 System.out.print(str[j] + " ");
		 }  
	}

}
