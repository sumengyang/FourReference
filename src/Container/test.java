package Container;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		int a = 2;
		int[] b = {1,0,1};
		long res = superPow(a,b);
		System.out.println(res);

	}

	private static long superPow(int a, int[] b){
		int num = 0;
		for(int i = 0; i < b.length; i++)
			num = num*10 + b[i];
		long result = 0;
		result = pow(a,num)%1337;
		return result;
	}
	
	private static long pow(int a,int n){
		if(n ==0)
			return 1;
		long v = pow(a,n/2);
		if(n % 2 == 0)
			return v* v;
		else
			return v* v * a;
	}
}
