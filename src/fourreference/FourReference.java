package fourreference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;


public class FourReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello");
		
		ReferenceQueue rq = new ReferenceQueue();
		
		WeakReference wr = new WeakReference(str,rq);
		
		System.out.println(str);
		System.out.println(rq);
		System.out.println(wr);
		
		str = null;
		
		int[] a = new int[1024*1024];
//		
//		String str0 = (String) wr.get();
//		System.out.println(str0);
		
		System.gc();
		System.gc();
		System.gc();
		
		String str1 = (String) wr.get();
		System.out.println(str1);
		
		Reference ref = rq.poll();
		System.out.println(ref);
		
		
	}

}
