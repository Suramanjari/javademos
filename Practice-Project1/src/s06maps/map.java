package s06maps;

import java.util.*;

public class map {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Sheela");    
	      hm.put(2,"Kevin");    
	      hm.put(3,"Tara");   
	       
	      System.out.println("Elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Shreya");  
	      ht.put(5,"Ranaut");  
	      ht.put(6,"Abi");  
	      ht.put(7,"Rita");  

	      System.out.println("\nElements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Shabin");    
	      map.put(9,"Nikhil");    
	      map.put(10,"Clara");       
	      
	      System.out.println("\nElements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}


	


