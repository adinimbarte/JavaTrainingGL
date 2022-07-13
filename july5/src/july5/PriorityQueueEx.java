package july5;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Mike");
		queue.add("Harry");
		queue.add("Jane");
		queue.add("Aditi");
		System.out.println("PriorityQueue is implemented: "+queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		

	}

}
