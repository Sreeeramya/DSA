public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void inserrt_first(int value){
        Node n1=new Node(value);
        n1.next=head;
        head=n1;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insert_last(int value){
        if(tail==null){
            inserrt_first(value);
            return;
        }
        Node n1=new Node(value);
        tail.next=n1;
        tail=n1;
        size++;
    }
    public void insert(int value,int index){
        if(index==0){
            inserrt_first(value);
        }
        else if(index==size){
            insert_last(value);
        }

        else{
            Node temp=head;

            for(int  i=1;i<index;i++){
                temp=temp.next;
            }
            Node n1=new Node(value,temp.next);
            temp.next=n1;
            size++;
        }
    }
    public int delete_first(){
        int v=0;
        if(head==null && tail==null){
            System.out.println(
                    "empty list"
            );
        }
        else if(head==tail){
            v=head.data;
            head=null;
            tail=null;
            size--;
        }
        else{
            v=head.data;
            head=head.next;
            size--;
        }
        return v;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public int delete_last(){
        int val=0;
        if(size<=1){
            delete_first();
        }
        else{
            val=tail.data;
            Node second_last=get(size-2);
            tail=second_last;
            tail.next=null;
        }
       return val;
    }
    public int delete(int index){
        int val=0;
        if(index==0){
            return delete_first();
        }
        else if(index==size-1){
            return delete_last();
        }
        else{
            Node n1=get(index-1);
            Node n2=n1.next;
            val=n2.data;
            n1.next=n2.next;
            size--;
        }
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
