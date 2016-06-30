package TestString;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "a  b   c ";
		s = reverseWords(s);
		System.out.println(s);
	}
	public static String reverseWords(String s) {
        s.trim();
        
        String[] arrayStr = s.split("\\s+");
        int len = arrayStr.length;
        System.out.println(len);
        String temp;
        for(int i = 0; i < len/2; i++)
        {
            temp = arrayStr[i];
            arrayStr[i] = arrayStr[len-i-1];
            arrayStr[len-i-1] = temp;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(i>0)
                sb.append(" ");
            sb.append(arrayStr[i]);
        }
        return sb.toString().trim();
    }
}
