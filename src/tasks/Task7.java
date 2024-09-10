package tasks;

public class Task7 {

	public static void main(String[] args) 
	{
		// Arithmetic operators 
				int  x=13; //Declare and Assign value 
				int  y=4;
				int sum= x+y;
				int sub=x-y;
				int mul=x*y;
				System.out.println("sum of x&y is :"+sum);
				double  z=12.11;
				System.out.println("sum of x,y&z is:" +(z+sum));
				System.out.println("Difference of x&y is :"+sub);
				System.out.println("mul of X&y:"+mul);
				System.out.println("Division of X& y is :"+(x/y) );
				System.out.println("remainder of X& y is :"+(x%y) );
		
	//Relational operators : compare two  variables &returns boolean value  either true or false 
				System.out.println(x>y);
				System.out.println(x<y);
				System.out.println(x>=y);
				System.out.println(x<=y);
				System.out.println(x==y);
				System.out.println(x!=y);
				  boolean res =(x>y);
				  System.out.println(res);
	//Logical operators : logical operators :&&,||,!: works b/w two boolean values 
				  boolean a=true;
				  boolean b=false;
				  System.out.println(a&&b);
				  System.out.println(a||b);
				  System.out.println(!a);
				  System.out.println(!b);
		//Increment & Decrement operators 
				  int k=20;
				  System.out.println(k);
				  k++  ;    //     k=k+1;
				  System.out.println(k);
				  int i=21;
				  int j=i++;
				  System.out.println(j);
				  System.out.println(i);
				  
		//Assignment operators 
				  int e=5;
				  e+=5;
				  System.out.println(e); 
				  e-=4;
				  System.out.println(e);
				  e*=2;
				  System.out.println(e);
				  e/=5;
				  System.out.println(e);
				  e%=5;
				  System.out.println(e);
		//conditional/ternary  operators :?
				  
					int f =100, g=200;
					int h= (f>g) ?f:g;  // (?: -->returns  f value  is assign to and return x value otherwise it returns g)
					System.out.println(h);
					int person_age=15;
					String result =(person_age>18)?"Eligible" :"Not Eligible";
					System.out.println(result);
					
	}

}
