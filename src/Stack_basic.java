import java.util.Stack;

public class Stack_basic {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(23);
        s1.push(45);
        s1.push(67);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
