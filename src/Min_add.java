import java.util.Stack;

public class Min_add {
    public static void main(String[] args) {
        String s="((()))";
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch==')') {
                if(!s1.isEmpty() && s1.peek()=='('){
                    s1.pop();
                }
                else{
                    s1.push(ch);
                }
            }
            else{
                s1.push(ch);
            }
        }
        System.out.println(s1.size());
    }
}
