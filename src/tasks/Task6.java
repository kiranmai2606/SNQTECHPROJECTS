package tasks;

public class Task6 {

	public static void main(String[] args) 
	{
		//one dimensional array
		int arr[]= {10,20,30,40,50};
		System.out.println(arr.length);
		
		System.out.println("Elements in array ");//Finding length of an array 
		 for (int i=0;i<arr.length ;i++)
		  {
			 
			  System.out.println(+arr[i]);// For printing array elements 
		  }
		 System.out.println("Reverse array ");
		 for(int j=arr.length-1 ;j>=0; j--)
		 {
		  // Reverse array elements 
		  System.out.println(arr[j]);
		 }  
	}

}
