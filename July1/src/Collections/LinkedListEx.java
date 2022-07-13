package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String>list =new LinkedList<String>();
		list.add("Aditi");
		list.add("Java");
		list.add("python");
		list.add("c++");
		
		list.addFirst("Sakshi");
		list.addLast("The end");
		list.add(3,"Subhash");
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
