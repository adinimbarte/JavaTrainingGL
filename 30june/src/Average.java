import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit1:");
		double digit1=sc.nextInt();
		System.out.println("Enter the digit2:");
		double digit2=sc.nextInt();
		System.out.println("Enter the digit2:");
		double digit3=sc.nextInt();
		double avg=((digit1+digit2+digit3)/3);
		System.out.println("The Average is: "+ avg);
		sc.close();
	}

}
