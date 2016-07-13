package Container;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = tableSizeFor(25);
		System.out.println(i);
	}
	  static final int tableSizeFor(int paramInt)
	  {
	    int i = paramInt - 1;
	    i |= i >>> 1;
	    i |= i >>> 2;
	    i |= i >>> 4;
	    i |= i >>> 8;
	    i |= i >>> 16;
	    return i >= 1073741824 ? 1073741824 : i < 0 ? 1 : i + 1;
	  }
}
