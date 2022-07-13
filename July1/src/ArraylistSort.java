
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Countries=new ArrayList<String>();
		Countries.add("Austria");
		Countries.add("Belgium");
		Countries.add("Denmark");
		Countries.add("Czechia");
		Countries.add("Estonia");
		
		ArrayList<String> Colors=new ArrayList<String>();
		Colors.add("White");
		Colors.add("Orange");
		Colors.add("Red");
		Colors.add("Indigo");
		Colors.add("Purple");
		
		System.out.println("List of Country");
		System.out.println("\n ----------------------------\n");
		for(String display:Countries)
			System.out.println(display);
		System.out.println("\n ----------------------------\n");
		Collections.sort(Countries);
		System.out.println("List of Country Sorted in asce-nding order:");
		for(String display:Countries)
			System.out.println(display);
		
		Collections.reverse(Countries);
		System.out.println("\n ----------------------------\n");
		System.out.println("List of Country Sorted in Descending order:");
		for(String display:Countries)
			System.out.println(display);
		System.out.println("\n ----------------------------\n");
		Colors.addAll(Countries);
		System.out.println(Colors);
		

	}

}
