package Javadatatypes;
import java.util.Scanner;


public class Datatypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Age of person");
		int age=input.nextInt();
		input.close();
		if (age<18)
			System.out.println("not eligible");
		else
			System.out.println("eligible");

	}

}
