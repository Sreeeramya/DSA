import java.util.Stack;

public class Queue_by_stacks_removal_eff {
    Stack <Integer> f;
    Stack<Integer> s;
    public Queue_by_stacks_removal_eff() {
        f=new Stack<>();
        s=new Stack<>();
    }
    public void add(int item){
        while(!f.isEmpty()){
            s.push(f.pop());
        }
        f.push(item);
        while(!s.isEmpty()){
            f.push(s.pop());
        }
    }
    public int remove() {
        return f.pop();
    }
    public int peek(){
        return f.peek();
    }
    public boolean empty(){
        return f.isEmpty();
    }
//    public void display(){
//        while(!f.isEmpty()){
//            s.push(f.pop());
//        }
//        while(!s.isEmpty()){
//            int val=s.pop();
//            System.out.print(val+" ");
//            f.push(val);
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        Queue_by_stacks_removal_eff q1=new Queue_by_stacks_removal_eff();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.remove();
    }

}
