package TestString;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 1;
		boolean a = true ? true : ++i == 2 ? false : true;
		System.out.println("a:" + a + ", i:" + i);
		boolean b = false ? true : ++j == 2 ? false : true;
		System.out.println("b:" + b + ", j:" + j);

		String str11 = "aaa";
		String str1 = new String("aaa");

		System.out.println(str1 == str11);

		String str2 = str1;
		str1 = "bbb";
		str2 = "ccc";
		// str2 = new String("bbb");
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Integer i1 = 128;
		Integer i11 = new Integer(128);
		
		System.out.println(i1==i11);
		
		Integer i2 = 12;
		Integer i21 = 12;
		Integer i22 = new Integer(12);
		
		System.out.println(i2==i21);
		System.out.println(i2==i22);
		
		
		String str = null;
//		str = NULL;
		
		System.out.println(Boolean.TYPE);
		System.out.println(Character.TYPE);
		System.out.println(Integer.TYPE);
		System.out.println(Byte.TYPE);
		System.out.println(Float.TYPE);
		System.out.println(Double.TYPE);
		System.out.println(Long.TYPE);
		System.out.println(Short.TYPE);
		
		
		System.out.println(Character.SIZE);
		System.out.println(Boolean.TYPE);
	}

}
