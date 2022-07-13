import java.util.Scanner;
//import java.lang.Math;

public class FloatCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		float number=sc.nextFloat();
		if(number==0)
			System.out.println("Zero");
		else if(number>0)
		{
			if(Math.abs(number)<1)
				System.out.println("Small");
			else if(Math.abs(number)>1000000)
				System.out.println("Large");
			else
				System.out.println("Positive");
			
		}
			
		else if(number<0)
			System.out.println("Negative");
sc.close();
	}

}
