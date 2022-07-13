package fileHandle;

import java.io.File;

public class Methods {

	public static void main(String[] args) {
		File file=new File("NewFile.txt");
      
		try {
			boolean value=file.createNewFile();
			if(value)
				{
				System.out.println("the new file is created");
				}
			else {
				System.out.println("the file already exists");
			}

		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("Exception handles file cant be created");
		} 
     if (file.exists()) { 
         System.out.println("name of the file is: " + file.getName());  

        
          

         System.out.println("writeable: " + file.canWrite());    

        
         System.out.println("readable " + file.canRead());    

         System.out.println("The size of the file in bytes is: " + file.length()); 
         System.out.println("absolute path of file is: " + file.getAbsolutePath());    
     } else {  
         System.out.println("The file does not exist.");  
     } 
     file.delete();
     System.out.println("list oof files: "+file.list());
 }  
}  