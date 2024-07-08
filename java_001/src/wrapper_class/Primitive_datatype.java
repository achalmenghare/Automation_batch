package wrapper_class;

public class Primitive_datatype {

	public static void main(String[] args) {
		long o = 65;
		Long ab = new Long(o);
		System.out.println(ab.valueOf(o));

		float m = 54.9f;
		Float j = new Float(m);
		System.out.println(j.valueOf(m));

		int u = 78;
		Integer l = new Integer(u);
		System.out.println(l.valueOf(u));

		byte r = 45;
		Byte h = new Byte(r);
		System.out.println(h.valueOf(r));

		short i = 87;
		Short g = new Short(i);
		System.out.println(g.valueOf(i));
	}


}
