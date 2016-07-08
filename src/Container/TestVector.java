package Container;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vectorMethods();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
    public static void vectorMethods()
    {
        Vector v1 = new Vector<String>();
        v1.add("Vector001");
        v1.add("Vector002");
        v1.add("Vector003");
        v1.add("Vector004");
        v1.add("Vector005");

        Enumeration e1 =v1.elements();
        while (e1.hasMoreElements())
        {
            Object object = e1.nextElement();
            System.out.println(object);
        }
    }
}
