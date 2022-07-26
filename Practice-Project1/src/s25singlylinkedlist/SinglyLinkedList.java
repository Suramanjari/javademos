package s25singlylinkedlist;

public class SinglyLinkedList {
	
	Node head; 
	static class Node { 
    	int data; 
    	Node next; 
    	Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 

	public static SinglyLinkedList insert(SinglyLinkedList list, int data) { 
    	Node new_node = new Node(data); 
    	new_node.next = null; 
    if (list.head == null) { 
        list.head = new_node; 
    } 
    else 
    { 
     Node last = list.head; 
     while (last.next != null) 
    { 
     last = last.next; 
    } 
     last.next = new_node; 
    } 
     return list; 
	} 
	public static void printList(SinglyLinkedList list) 
	{	 
     Node currNode = list.head; 
     System.out.print("LinkedList: "); 
     while (currNode != null) 
    { 
     System.out.print(currNode.data + " "); 
     currNode = currNode.next; 
    } 
     System.out.println(); 
	} 

	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) 
	{ 
     Node currNode = list.head, prev = null; 
     If (currNode != null && currNode.data == key); 
    { 
     list.head = currNode.next; 
     System.out.println(key + " found and deleted"); 
     return list; 
    } 
	} 
	 
	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{ 
	 SinglyLinkedList list = new SinglyLinkedList();  
    	list = insert(list, 2); 
    	list = insert(list, 4); 
    	list = insert(list, 6); 
    	list = insert(list, 8); 
    	list = insert(list, 10); 
    	list = insert(list, 12); 
    	list = insert(list, 14); 
    	list = insert(list, 16);  
    	printList(list); 
    	deleteByKey(list, 2); 
  		printList(list);  
    	deleteByKey(list, 5); 
    	printList(list); 
    	deleteByKey(list, 11); 
    	printList(list); 
	} 
} 