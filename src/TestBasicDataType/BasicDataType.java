package TestBasicDataType;

public class BasicDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.SIZE;
		int[] a = {1,2,3};
		
		System.out.println("integer size : " + a.length);
		
		int shift = 0<<1;
		System.out.println("0 shift : " + shift);
		
		int ss = 49;
		ss = shiftInt(ss);
//		ss = shiftInt(ss);
		System.out.println("ss shift : " + ss);
		
		
	}
	private static int shiftInt(int ss){
		int bit= 0;
		int res = 0;
		int n = Integer.SIZE;
		
		for(int i = 0; i < n; i++){
			bit = ss & (1 << i);
			if (bit!= 0)
				res += bit << (n-1-i);
		}		
		return res;
	}
	
	public static int reverseBits(int n) {
		int res = 0;
		int bit = 0;
		for (int i = 0; i < 32; i++) {
			bit = n & (1 << i);
			if (bit != 0)
				res = res + (1 << (31 - i));
		}
		return res;
	}

}
