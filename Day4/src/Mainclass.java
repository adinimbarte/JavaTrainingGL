import java.util.Scanner;

class Subclass extends Mainclass
{
	
		//checking no is odd or even
		void oddEven(int n) 
		{
			if (n%2==0)
				System.out.println("Number is even");
			else
				System.out.println("Number is odd");
			
		}
		// printing number odd or even till 20
		void rOddEven() 
		{
			System.out.println("\nprinting numbers Upto 20 as odd and even");
			for (int i=0;i<=20;i++)
			{
				if(i%2==0)
					System.out.println(i+"= Even");
				else
					System.out.println(i+ "= Odd");
			}
		}
		
		//printing largest among 3 numbers
		void largestNum(int digit1,int digit2,int digit3)
		{
			if(digit1>digit2 && digit1>digit3)
				System.out.println(digit1+" is the largest number");
			else if(digit2>digit3)
				System.out.println(digit2+" is the largest number" );
			else 
				System.out.println(digit3+ " is the largest number");
		}
		
		//check person is eligible for voting or not
		void Voter(int age)
		{
	
			if (age<18)
				System.out.println("not eligible for voting");
			else if(age>=18)
				System.out.println("eligible for voting");
			
		}
	
	}

public class Mainclass {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Subclass logic=new Subclass();
		System.out.println("Enter a number to check odd or even: ");
		int num=sc.nextInt();
		logic.oddEven(num);			//calling method oddEven()
		System.out.println("===============================================\n");
		
		logic.rOddEven();			//calling method rOddEven()
		System.out.println("===============================================\n");
		
		System.out.println("\nEnter three number \n number one: ");
		int digit1=sc.nextInt();
		System.out.println("second number: ");
		int digit2=sc.nextInt();
		System.out.println("Third number: ");
		int digit3=sc.nextInt();
		logic.largestNum(digit1, digit2, digit3); 		//calling largestNum()
		System.out.println("===============================================\n");
		
		System.out.println("Enter age of a person to check eligible for voting or not: ");      
		int age=sc.nextInt();
		sc.close();
		logic.Voter(age);		//calling voter() 

	}

}
