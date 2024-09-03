package programs;

import tasks.Task3;

public class program1 extends Task3{
	public static void main(String[] args) 
	{
		Task3.PublicMethod();
		//Task3.PrivateMethod(); can not access private method outside the package 
		//Task3.DefaultMethod(); can not access Default method outside the package 
		program1 obj = new program1();
		 obj.ProtectedMethod();//  can access protected method by creating object &  using extends keyword
		
	}

}
