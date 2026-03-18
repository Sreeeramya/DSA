import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_basic {
    public static void main(String[] args) {
        Deque<Integer> d1=new ArrayDeque<>();
        d1.add(34);
        d1.add(78);
        d1.add(89);
        d1.addFirst(67);
        d1.addLast(77);
        for(int a:d1){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(d1.remove());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeLast());
        for(int a:d1){
            System.out.print(a+" ");
        }
    }
}
