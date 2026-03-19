public class Queue_Main {
    public static void main(String[] args) throws Exception{
        Custom_Queue c1=new Custom_Queue(5);
        c1.insert(12);
        c1.insert(13);
        c1.insert(67);
        c1.insert(77);
        c1.insert(89);
        c1.display();
        System.out.println(c1.remove());
        c1.display();

    }
}
