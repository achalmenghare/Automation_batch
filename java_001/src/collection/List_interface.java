package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class List_interface {

	public static void main(String[] args) {
		
		//Arraylist class
		
		
		ArrayList<Integer> roomno = new ArrayList<Integer>(); 
		roomno.add(1);
		roomno.add(2);
		roomno.add(3);
		roomno.add(4);
		roomno.add(5);
		roomno.add(0);
		roomno.add(6);
		roomno.add(7);
		roomno.add(8);
		roomno.add(9);
		roomno.add(10);
		roomno.add(null);
		System.out.println(roomno);
		
		roomno.add(5, 15);
	   System.out.println(roomno);
	
	   roomno.contains(5);
	   System.out.println(roomno.clone());
	
	  System.out.println(roomno.isEmpty());
	 System.out.println(roomno.remove(5));
	
	
	 ArrayList<String> name = new ArrayList<String>(); 
	name.add("ram");
	name.add("sham");
	
	name.add("sam");
	
	name.add("prem");
	
	name.add("tom");
	
	name.add("john");
	
	System.out.println(name);
	System.out.println(name.contains("sam"));
	
	System.out.println(name.isEmpty());
	
	System.out.println(name.clone());
	
	name.add(2, "rani");
	System.out.println(name);
	
	System.out.println(name.removeFirst());
	System.out.println(name);
	
	System.out.println(name.removeLast());
	System.out.println(name);
	
	
	//Linkedlist class
	
	LinkedList<Integer> number = new LinkedList<Integer>(); 
	number.add(1);
	number.add(2);
	number.add(3);
	number.add(4);
	System.out.println(number);
	
	System.out.println(number.clone());
	
	System.out.println(number.contains(2));
    
	System.out.println(number.isEmpty());
	
	System.out.println(number.remove(3));
	}
	
	
	

}
