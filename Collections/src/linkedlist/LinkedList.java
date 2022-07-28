package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	public static void main(String[] args ) {
		
		Object[] objects = new Object[1000000];
		for (int i = 0; i<objects.length; i++) {
			objects[i] = new Object();	
		}
		
		List<Object> linklist = (List<Object>) new LinkedList();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			linklist.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken for adding to linked list: " +(end - start)+"ms");
		
		List<Object> arrlist = new ArrayList<>();
		start = System.currentTimeMillis();
		Object object;
		for(Object object1 : object);
			arrlist.add(object);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding to ArrayList: " + (end - start) + "ms");
	}

}
