package TestBasicDataType;

public class NaNTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = Double.NaN;
		double d2 = Double.NaN;
		if(d1 > d2 || d1 <= d2){
			System.out.println("����");
		}
		else
			System.out.println("������d1 > d2 || d1 <= d2");
	}

}
