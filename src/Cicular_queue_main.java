public class Cicular_queue_main {
    public static void main(String[] args) throws Exception{
        Circular_queue c1=new Circular_queue(5);
        c1.insert(10);
        c1.insert(20);
        c1.insert(30);
        c1.display();
        System.out.println();
        c1.remove();
        c1.display();
        System.out.println();
        c1.insert(40);
        c1.insert(50);
        c1.display();
        System.out.println();
        c1.insert(60);
        c1.display();
        System.out.println();
        c1.remove();
        c1.insert(70);
        c1.display();



    }
}
