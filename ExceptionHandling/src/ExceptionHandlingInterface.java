//import ExceptionHandlingInterface.InvalidProductException;
//
//public class ExceptionHandlingInterface {
//	class InvalidProductException{
//	public InvalidProductException()
//	{
//		super(s);
//	}
//	}
//
//
//	
//
//}
//class AnotherExampleCustomException{
//	void productCheck(int weight) throws InvalidProductException
//	{
//		if(weight<100)
//		{
//			throw new InvalidProductException("Product invalid");
//		}
//	}
//	public static void main(String[] args) 
//	{
//		AnotherExampleCustomException object=new AnotherExampleCustomException();
//		try {
//			object.productCheck(80);
//		}
//		catch(InvalidProductException exp){
//			System.out.println("caught the exception");
//			System.out.println(exp.getMessage());
//			
//		}
//	}
//}