public class Stack_Main {
    public static void main(String[] args) throws Stack_Exception{
        Custom_Stack s1 =new Custom_Stack();
        s1.push(23);
        s1.push(45);
        s1.push(67);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
