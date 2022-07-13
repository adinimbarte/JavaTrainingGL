package july5;

import java.util.Deque;
import java.util.LinkedList;

public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque= new LinkedList<String>();
		deque.add("Aditi");
		deque.add("Sam");
		deque.addFirst("Mike");
		deque.addLast("Harry");
		deque.add("James");
		deque.add("John");
		System.out.println("Dequeue: "+deque);
		System.out.println(deque.contains("Mike"));
		System.out.println("getlast:"+deque.getLast());
		System.out.println("getfirst:"+deque.getFirst());
		System.out.println("peeklast: "+deque.peekLast());
		System.out.println("peekfirst: "+deque.peekFirst());
		System.out.println("polllast: "+deque.pollLast());
		System.out.println("poll first: "+deque.pollFirst());
		
		System.out.println("Size: "+deque.size());
		

	}

}
