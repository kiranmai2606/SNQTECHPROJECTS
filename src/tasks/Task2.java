/*[TASK:2]Create static methods and non
static methods and call them to main method in the OTHER CLASS and print the statements in console*/
package tasks;

public class Task2  extends Task3 {

	public static void main(String[] args) 
	{
		/*calling static method in main class
				Task1.staticMethod();//Approach 1 : By using class name
				//staticMethod();// Approach 2 : Directly calling static method with out using class
				//calling non static methods in main class
				Task1 call= new Task1();
				call.NonstaticMethod();*/
		Task3.PublicMethod();
		//Task3.PrivateMethod();// can not access private method 
		Task3.ProtectedMethod();
		Task3.DefaultMethod();
		
				
			}
	}


