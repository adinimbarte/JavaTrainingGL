import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Aditi"); //adding element to linked list
		list.add("John");
		list.add("Will");
		
		list.add(1, "Mike"); //adding element at a specific position in linked list
		list.addFirst("Start"); // adding element in the beginning
		
		list.addLast("Last"); //adding element at last position
		System.out.println("After all insertion:");
		
		
		//iteration 
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+ " ->");
		}
		list.removeFirst(); //deleting starting element 
		list.removeLast(); //deleting last element
		
		list.remove(3); // removing from specific index
		list.remove("will"); //removing element with name
		System.out.println("\n-------------------------------------------");
		System.out.println("\nAfter remove operation:");
		for (String ele:list)
		{
			System.out.print(ele+"-> ");
		}
//		Iterator<String>iterator=list.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.print(iterator.next()+ " => ");
//		}
		
		//finding elements in LinkedList
		System.out.println("First element of linked list: "+list.getFirst());
		System.out.println("Last element of linked list: "+list.getLast());
		if(list.contains("Aditi"))
			System.out.println("List contains aditi");
		System.out.println("printing sublist:" +list.subList(1, 3));
		
		
		// List iteration
		ListIterator<String>it=list.listIterator();
		System.out.println("\n-------------------------------------------");
		System.out.println("Using ListIterator");
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ->");
		}
		Collections.reverse(list);// reverse list
		System.out.println("Reverse List:");
		for (String rev:list)
		{
			System.out.print(rev+" => ");
		}
		System.out.println("\n-------------------------------------------");
		
		//Replacing element
		list.set(2, "Updated Element");
		
		 // checking element is present or not
		if(list.contains("Updated Element"))
			System.out.println("\nList contains 'Updated Element'");
		list.add("Aditi");
		
		
		LinkedList <String> list1=new LinkedList<String>();
		list1=(LinkedList<String>)list.clone(); //cloning linked list
		for(String update:list1)
		{
			System.out.print(update+" => ");
		}
		
		System.out.println("\nIndex of last occurence in linked list: "+ list.lastIndexOf("Aditi"));
		System.out.println("\n-------------------------------------------");
		//pop element from linked list
		System.out.println(list.pop());
		list.push("Jack"); //pushing 'jack' to linked list
		System.out.println("Poll= "+list.poll());
		System.out.println("Poll first= "+list.pollFirst());
		System.out.println("Poll Last= "+list.pollLast());
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Peek:"+ list.peek());
		System.out.println("Peek First:" +list.peekFirst());
		System.out.println("Peek Last: "+ list.peekLast());
		
		}
	
	
	
	
	

}
