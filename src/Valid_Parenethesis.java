import java.util.Stack;

public class Valid_Parenethesis {
    public static void main(String[] args) {
        String str = "([)";
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                s1.push(ch);
            }
            else{
                if(s1.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char top=s1.pop();
                if((ch==')'&& top!='(') || (ch==']' && ch=='[') || (ch=='}' && ch=='{')){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(s1.isEmpty());
    }
}
