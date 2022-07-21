package s05collection;

import java.util.*;

public class Collections {
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Tamilnadu");//
	      city.add("Bangalore");    	   
	      System.out.println(city);  
		
	      System.out.println("\nVector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(7); 
	      vec.addElement(8); 
	      System.out.println(vec);
		
	      System.out.println("\nLinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Saraah");  
	      names.add("Karan");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       System.out.println("\nHashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(11);  
	       set.add(12);
	       set.add(13);
	       System.out.println(set);
	       
	       System.out.println("\nLinkedHashSet");
	       LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();  
	       set1.add(33);  
	       set1.add(34);  
	       set1.add(35);
	       set1.add(36);	       
	       System.out.println(set1);
	      	} 
	      }  
	}


