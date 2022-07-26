package s29queue;

import java.util.LinkedList;

public class Queue {
	
	public static void main(String[] args) 
	{
	   LinkedList locationsQueue = new LinkedList<>();
	   locationsQueue.add("Bangalore");
	   locationsQueue.add("Chennai");
	   locationsQueue.add("Mumbai");
	   locationsQueue.add("Hyderbad");
	   locationsQueue.add("Pune");
	   System.out.println("Queue is : " + locationsQueue);
	   System.out.println("Head of Queue : " + locationsQueue.peek());
	   locationsQueue.remove();
	   System.out.println("After removing Head of Queue : " + locationsQueue);
	   System.out.println("Size of Queue : " + locationsQueue.size());
	}
}