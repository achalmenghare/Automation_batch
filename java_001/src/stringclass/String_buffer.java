package stringclass;

public class String_buffer {

	public static void main(String[] args) {

		String name = new String("achal");
		System.out.println(name);

		String name1 = name.concat("menghare");
		// System.out.println(name.concat("menghare"));
		System.out.println(name1);
		System.out.println("---------------------------------");

		System.out.println(name);

		// string is immutable i.e it is not a mutable class.(it does not change value)

		System.out.println("------------------------------------------------");
		System.out.println("-----------------------------------------------");

		// string buffer is mutable class(value will be change)

		StringBuffer testing = new StringBuffer("automation");
		System.out.println(testing);
		StringBuffer testing2 = testing.append("testing1");

		System.out.println(testing2);
		System.out.println("---------------------------");
		System.out.println(testing);
	}

}
