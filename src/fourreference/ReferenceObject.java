package fourreference;


public class ReferenceObject {

	public static void main(String[] args) {
		String[] str = new String[5];
		System.out.println(str[0]);//null

		String str2 = new String();
		System.out.println("str2 : " + str2);//str : 
		
		
		float[] f = new float[5];
		System.out.println(f[0]);
		
		float f2 = 0;
		System.out.println(f2);
		
		double d1 = 1.0/0.0;//int i = 1/0; ArithmeticException by zero
		double d2 = Double.MIN_VALUE;
		double d3 = Double.POSITIVE_INFINITY;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		
		int i0 = (int) Math.sqrt(123);
		System.out.println(i0);
		double i1 = Math.sqrt(123.0);
		System.out.println(i1);
		
	}
}
