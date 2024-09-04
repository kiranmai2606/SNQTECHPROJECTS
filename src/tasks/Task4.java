//[TASK-4]:Explore String methods and Document Important methods and their uses
//Data Types 
package tasks;

public class Task4 {

	public static void main(String[] args) 
	{
		//Declaring & assigning values  to variables & Data Types[Primitive Data Types]
		int num1=26;
		int num2=95;
		float num3 =30.6f;
		double num4=99.9999f;
		char grade ='A';
		//Declaring String [Non primitive Data Types]
		String str ="Learning Java";
		System.out.println(str);//Print the string value 
		//String Methods 
		//1.CharAT : Ret.
		System.out.println(str.charAt(8));//space is also return as a character
		System.out.println(str.charAt(6));
		//2.compareTo: 
		System.out.println(str.compareTo("Learning Java"));//Returns 0
		System.out.println(str.compareTo("SNQTECH"));//Returns some value 
		System.out.println(str.compareTo(str));//returns 0 
		//System.out.println(str.compareTo(null));//Null pointer Exception 
		//3.compareToIgnoreCase:
		System.out.println(str.compareToIgnoreCase("LEARNING JAVA"));//Ignore case and returns 0 if both  the strings are  equal 
		System.out.println(str.compareToIgnoreCase ("learning java"));
		System.out.println(str.compareToIgnoreCase("snqtech"));
		//4.equals():Checks two string and return true if both strings are equal  else returns false
			System.out.println(str.equals(str));//true case
			System.out.println(str.equals("SNQTECH"));//false case 
		//5.equalsIgnoreCase
			System.out.println(str.equalsIgnoreCase(str));
			System.out.println(str.equalsIgnoreCase("java learning"));
		//6.toLowerCase
			System.out.println(str.toLowerCase());
		//7.toUpperCase
			System.out.println(str.toUpperCase());
		//8.concat:
			System.out.println(str.concat("-SNQTECH"));
		//9.contains:
			System.out.println(str.contains("Java"));//Returns true as string contains Java
			System.out.println(str.contains("Automation"));//Returns false as string do not contains Automation 
		//10.length:
			 System.out.println(str.length());
		//11.startsWith:
			System.out.println(str.startsWith("Learn")); 
		//12.endsWith
			System.out.println(str.endsWith("Testing"));
		//13.replace
			 System.out.println(str.replace("Java", "Selenium"));
		//14.replaceAll
			 System.out.println(str.replaceAll(str, "Learning Automation"));
		//15.isBlank():
			 System.out.println(str.isBlank());
			 String str1="";
			 System.out.println(str1.isBlank());
		//16.isempty():
			 System.out.println(str.isEmpty());
			 System.out.println(str1.isEmpty());//Returns true if the length of the string is 0
		//17.toString():
			 System.out.println(str.toString());
		//18.trim 
			 String str2 ="   java    ";
			 System.out.println(str2.trim());
		//19.split 
			 String str3 ="SNQTECH";
				String arr[]=str3.split("Q");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
			//20.content equals 
			System.out.println(str.contentEquals(str1));
		
			 
		
		
			 
		
		

			 
	
			 
			 
			 
			 
			
		
		
		
		
		
		
		
		
		 
		 
	}

}
