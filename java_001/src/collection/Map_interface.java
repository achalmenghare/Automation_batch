package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_interface {

	public static void main(String[] args) {
		
		//Hashmap class
	
	HashMap<Integer, String> value = new HashMap<Integer, String>(); 
	value.put(45, "manual");
	value.put(89, "automation");
	value.put(74, "api");
	value.put(40, "sql");
	value.put(100, "mobile testing");

	
	System.out.println(value);
	System.out.println(value.clone());
	
	System.out.println(value.containsKey(40));
	value.replace(40, "sql");
	System.out.println(value);
	value.replace(74, "api", "testing");
	System.out.println(value);
	
	
	//LinkedHashMap
	
	LinkedHashMap<Integer, String> name = new LinkedHashMap<Integer, String>();
	name.put(1, "abc");
	name.put(2, "jkl");
	name.put(3, "xyz");
	name.put(4, "opq");
	name.put(5, "mno");
	name.put(6, "fgh");
	System.out.println(name);
	
	System.out.println(name.clone());
	
	System.out.println(name.containsKey(2));
	System.out.println(name.pollFirstEntry());
	System.out.println(name.pollLastEntry());
	System.out.println(name.containsValue("abc"));
	
	
	}

}
