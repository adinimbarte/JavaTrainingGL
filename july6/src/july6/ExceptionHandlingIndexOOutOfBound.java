package july6;

public class ExceptionHandlingIndexOOutOfBound {

	public static void main(String[] args) {
		try {
			int ar[]=new int[7];
			ar[0]=1;
			ar[1]=1;
			ar[2]=1;
			ar[3]=1;
			ar[4]=1;
			ar[5]=1;
			ar[6]=1;
			ar[7]=60/0;
/*ar[8]=1;*/
			for(int i:ar)
			{
				System.out.println(","+i);
				
			}
			System.out.println();
			
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("First Catch Block:   "  +e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
