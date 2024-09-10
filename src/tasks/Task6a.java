package tasks;

public class Task6a {

	public static void main(String[] args) {
		//Two dimensional array 
		//Two dimensional 
		 int arr1[][]= {{100,200},{300,400},{500,600}};
		 System.out.println(arr1.length);//Length of two dimensional array 
		 System.out.println("No .of rows:" +arr1.length);
		 System.out.println("No.of.columns:" +arr1[0].length);
		 //For printing elements in two dimensional array
		 System.out.println("Elements in two dimensional array ");
		 for (int i=0;i<arr1.length;i++)
		 {
			 for (int j=0;j<arr1.length-1;j++) 
			 {
				 System.out.println(arr1[i][j]);
			 }
		 }
		 System.out.println("Revserse   two dimensional array ");
		 for (int i=arr1.length-1; i>=0; i--) 
		 {
			 for(int j=arr1[0].length-1;j>=0;j--)
			 {
				 System.out.println(arr1[i][j]); 
			 }
		 }
		 
	}

	}


