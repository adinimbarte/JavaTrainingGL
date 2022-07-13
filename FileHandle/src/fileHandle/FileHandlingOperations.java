package fileHandle;

import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingOperations {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		String data="This is the data in the NewFile Created.\n";
		String info="My name is Aditi Nimbarte,\n "
				+ "I am working as a trainee software developer in Globallogic\n";
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data to enter in file");
			String data1=sc.nextLine();
			sc.close();
			FileWriter output=new FileWriter("NewFile.txt");
			output.write(data);
			output.write(info);
			output.write(data1);
			System.out.println("Data is updated in file:\n");
			output.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}

	}

}
