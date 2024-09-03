/* Create static methods and non static methods and call 
   them to main method with in the class and print the statements in console*/
package tasks;

public class Task1 {

	public static void main(String[] args) 
	{
		// calling static method in main class
		Task1.staticMethod();//Approach 1 : By using class name
		//staticMethod();// Approach 2 : Directly calling static method with out using class
		//calling non static methods in main class
		Task1 call= new Task1();
		call.NonstaticMethod();
	}
	//Static method:
	
	public  static void staticMethod()
	{
		String str =" This is static method";
		System.out.println(str);
	}
	//non static method:
	public void  NonstaticMethod()
	{
		String str =" This is Nonstatic method";
		System.out.println(str);
	}
	
}
