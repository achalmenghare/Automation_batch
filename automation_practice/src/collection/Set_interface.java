package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set_interface {

	public static void main(String[] args) {
		
	//Hashset class
	
	HashSet<Integer> xyz  = new HashSet<Integer>(); 
	xyz.add(11);
	xyz.add(12);
	xyz.add(13);
	xyz.add(14);
	xyz.add(15);
	xyz.add(16);
	System.out.println(xyz);
	System.out.println(xyz.clone());
	
	System.out.println(xyz.contains(14));
	
	System.out.println(xyz.size());
	
	//using for loop
	
	for(int a= 1;a<=50;++a) {
	xyz.add(a);	
	
	}
	//to print all value
	System.out.println(xyz);
	System.out.println(xyz.clone());
	System.out.println(xyz.contains(25));
	System.out.println(xyz.isEmpty());
	System.out.println(xyz.size());
	System.out.println(xyz.remove(50));
	System.out.println(xyz);
	
	//LinkedHashSet class
	
	LinkedHashSet<Float> num = new LinkedHashSet<Float>();
	num.add(52.63f);
	num.add(45.78f);
	num.add(63.89f);
	num.add(99.32f);
	num.add(78.96f);
	num.add(71.52f);
	num.add(45.74f);
	num.add(12.23f);
	num.add(null);
	
	System.out.println(num);
	System.out.println(num.clone());
	
	System.out.println(num.contains(45.74));
	
	System.out.println(num.isEmpty());
	
	System.out.println(num.size());
	System.out.println(num.remove(null));
	System.out.println(num);
	
	}

}
