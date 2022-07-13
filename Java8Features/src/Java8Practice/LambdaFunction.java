package Java8Practice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface SingleParameter{
	public int incrementByFive(int a);
}
@FunctionalInterface
interface StringConcat{
	public String Concat(String a,String b);
}




public class LambdaFunction {

	public static void main(String[] args) {
		SingleParameter lambda=(number)->number+5;
		System.out.println("Given number is incremented by 5: "+lambda.incrementByFive(22));
		StringConcat object=(a,b)-> a+b;
		System.out.println("Concatinated string is : " +object.Concat("Aditi ","Nimbarte"));

		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Guava");
		list.add("Grapes");
		list.add("Kiwi");
		System.out.println("\nUsing ForEach method:\n");
		list.forEach((fruits)->System.out.println(fruits));
		System.out.println("\nUsing For loop:\n");
		for(String fruits:list) 
		{
			System.out.println(fruits);		
		}
		
		
	}

}
