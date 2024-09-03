package tasks;

public class Task3 {

	public static void main(String[] args) 
	{
		PublicMethod();
		PrivateMethod();
		ProtectedMethod();
		DefaultMethod();
		
	}
	public static void PublicMethod()
	{
		System.out.println("This is a PublicMethod");
	}
	private static void PrivateMethod()
	{
		System.out.println("This is a PrivateMethod");
	}
	protected static void ProtectedMethod()
	{
		System.out.println("This is a ProtectedMethod");
	}
	static void DefaultMethod()
	{
		System.out.println("This is a DefualtMethod");
	}
}
