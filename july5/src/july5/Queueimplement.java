package july5;

import java.util.LinkedList;
import java.util.Queue;

public class Queueimplement {

	public static void main(String[] args) {
		Queue<String> names=new LinkedList<String>();
		names.add("Athira");
		names.add("Joseph");
		System.out.println("Elements of Queue: "+names);
		System.out.println("Remove element: "+names.remove());
		
		// TODO Auto-generated method stub

	}

}
