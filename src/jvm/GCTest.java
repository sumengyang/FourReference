package jvm;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
	static final int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			byte[] plaveholder = new byte[64 * 1024 * 1024];
		}
		
		System.out.println(i);
		System.gc();
		
		List list = new ArrayList();
		
	}

}
