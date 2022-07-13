package Collections;
import java.util.*;
import Collections.ToStringarrayList;

public class Student {

	public static void main(String[] args) {
		ArrayList<ToStringarrayList> arrayList=new ArrayList<ToStringarrayList>();
		arrayList.add(new ToStringarrayList(101,"Aditi","YCCE","IT"));
		for(ToStringarrayList display:arrayList)
		{
			System.out.println(display);
		}
	}


}
