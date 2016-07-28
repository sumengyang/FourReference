import java.util.Stack;


public class ValidParentheses {

	public static void main(String[] args) {
		String str = "{}";
		boolean bool = isValid(str);
		System.out.println(bool);

	}
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
//                	System.out.println(Character.toString(stack.pop()).equals("("));
                    if(!stack.isEmpty() && ("(").equals(Character.toString(stack.pop()))){
                    	System.out.println("here");
                        break;
                    }
                    else
                        return false;
                case '}':
                    if(!stack.isEmpty() && (Character.toString(stack.pop()).equals("{")))
                        break;
                    else
                        return false;
                case ']':
                    if(!stack.isEmpty() && (Character.toString(stack.pop()).equals("[")))
                        break;
                    else
                        return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
