package fileHandle;

import java.io.FileReader;

public class Filehanling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file=new File("NewFile.txt");
//		try {
//			boolean value=file.createNewFile()
//;
//			if(value)
//				{
//				System.out.println("the new file is created");
//				}
//			else {
//				System.out.println("the file already exists");
//			}
//
//		}
//		catch(Exception e)
//		{
//			e.getStackTrace();
//			System.out.println("Exception handles file cant be created");
//		}
		char[] array=new char[1000];
		try {
			FileReader input=new  FileReader("NewFile.txt");
			input.read(array);
			System.out.println("Data in file:\n");
			System.out.println(array);
			input.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
