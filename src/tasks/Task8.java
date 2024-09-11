package tasks;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) 
	{
		voteEligibility();
		ifelseif();
		SwitchCase();
	

	}
	public static void voteEligibility()
	{
		
		System.out.println("Enter Person's Age ");
		Scanner num =new Scanner(System.in);
		int person_age = num.nextInt();
		if (person_age>=18)
		{
			System.out.println("person is eligible");
		}
		else 
		{
			System.out.println("person is non eligible");
		}
	}	
	public static void ifelseif()
		{
			//Example1
			System.out.println("Enter value of i");
			Scanner num1 = new Scanner(System.in);
			 int i = num1.nextInt();
			 if(i%2==0)
			{
				System.out.println("This is an even number");
			}
			else 
			{
				System.out.println("This is odd number");
			}
			//Example2
			 System.out.println("Enter value of j");
			 Scanner num2= new Scanner(System.in);
			 int j = num2.nextInt();
			if(j>0)
			{
				System.out.println("It is a positive number");
			
			}
			else if(j<0)
			{
				System.out.println("It is a negative number");
			}
			else 
			{
				System.out.println("It is zero");
			}
			//Example 3 
			 System.out.println("Enter value of a,b,c");
			Scanner num3= new Scanner(System.in);
			Scanner num4= new Scanner(System.in);
			Scanner num5= new Scanner(System.in);
			 int a = num3.nextInt();
			 int b = num3.nextInt();
			 int c = num3.nextInt();
			if(a>b&&a>c)
			{
				System.out.println("a is the largest number");
			}
			else if (b>a&&b>c)	
			{
				System.out.println("b is the largest number");
			}
			else 
			{
				System.out.println("cis the largest number");
			}
			//Example 4
			 int week=5;
			 if (week==0)
			 {
				 System.out.println("sunday");
			 }
			 else if(week==1)
			 {
				 System.out.println("Monday");
			 }
			 else if(week==2)
			 {
				 System.out.println("Tuesday");
			 }
			 else if(week==3)
			 {
				 System.out.println("Wedsenday");
			 }
			 else if(week==4)
			 {
				 System.out.println("Thursday");
			 }
			 else if(week==5)
			 {
				 System.out.println("Friday");
			 }
			 else if(week==6)
			 {
				 System.out.println("Saturday");
			 }
			 else
			 {
				 System.out.println("Invalidnumber");
			 }
		}
public static void SwitchCase() 
			 {
				 int month = 8;
				  String monthString;

			      switch (month) 
			      {
			          case 1:  monthString = "January";
			                   break;
			          case 2:  monthString = "February";
			                   break;
			          case 3:  monthString = "March";
			                   break;
			          case 4:  monthString = "April";
			                   break;
			          case 5:  monthString = "May";
			                   break;
			          case 6:  monthString = "June";
			                   break;
			          case 7:  monthString = "July";
			                   break;
			          case 8:  monthString = "August";
			                   break;
			          case 9:  monthString = "September";
			                   break;
			          case 10: monthString = "October";
			                   break;
			          case 11: monthString = "November";
			                   break;
			          case 12: monthString = "December";
			                   break;
			          default: monthString = "Invalid month";
			                   break;
			      }
			      System.out.println(monthString);  
		
		
			
			
		}
		
}
	

