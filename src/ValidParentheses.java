import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("(([]))"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stk.add(c);
            }
            else if(c == ')'){
                if(stk.isEmpty() || '(' != stk.peek()){
                    return false;
                }else{
                    stk.pop();
                }
            }
            else if(c == '}'){
                if(stk.isEmpty() || '{' != stk.pop()){
                    return false;
                }
            }
            else if(c == ']'){
                if(stk.isEmpty() || '[' != stk.pop()){
                    return false;
                }
            }

        }

        return stk.isEmpty();


    }
}
