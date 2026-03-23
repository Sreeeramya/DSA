public class Linked_l_main {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.inserrt_first(23);
        l1.inserrt_first(40);
        l1.inserrt_first(45);
        l1.inserrt_first(89);
        l1.insert_last(99);
        l1.insert(90,3);
        System.out.println(l1.delete_first());;
        l1.display();
        System.out.println(
        );
        l1.delete_last();
        l1.display();
        System.out.println();
        l1.delete(2);
        l1.display();

    }
}
