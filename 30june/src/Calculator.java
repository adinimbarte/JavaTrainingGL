import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		while(choice!=5)
		{
			System.out.println("Enter Your choice:\n 1.Addition\n2.Subtraction\n3.Multiply\n4.Division\n 5.Exit");
			choice=sc.nextInt();
			System.out.println("Enter the digit1:");
			int digit1=sc.nextInt();
			System.out.println("Enter the digit2:");
			int digit2=sc.nextInt();
		
		
		{
			switch(choice)
			{
				case 1:
				{
					System.out.println("Addition of digits is: "+ (digit1+digit2));
					break;
				}
				case 2:
				{
					System.out.println("Subtraction of digits is "+ (digit1-digit2));
					break;
				}
				case 3:
				{
					System.out.println("Multiplication of digits is "+ (digit1*digit2));
					break;
				}
				case 4:
				{
					System.out.println("Division of digits is "+ (digit1/digit2));
					break;
				}
				default: 
					System.out.println("Exit");
					break;
					
					
			}
		}
		}
		sc.close();
		

	}

}
