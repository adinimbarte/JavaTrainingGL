
public class ExceptionHandlingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int b=45/2;
			System.out.println(b);
		}
		catch(Exception e)
		{}
		try {
			int a=23/0;
			System.out.println(a);
			
		}
		catch (Exception e)
		{
			System.out.println("Arithmetic Exception occured");
		}
		try {
			System.out.println("Nested try block is implemented.");
		}
		catch(Exception e)
		{}

	}

}
