public class Circular_queue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    public int size=0;
    public Circular_queue(){
        this(DEFAULT_SIZE);
    }
    public Circular_queue(int size){
        this.data=new int[size];
    }
    public boolean isfull(){
        {
            return size==data.length;
        }
    }
    public boolean isempty(){
        return size==0;
    }
    public boolean insert(int item){
        if (isfull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("queue is empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if (isempty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display(){
        if (isempty()){
            System.out.println("empty queue");
            return;
        }
        int i=front;
        for(int c=0;c<size;c++) {
            System.out.print(data[i]+ " ");
            i =(i+1)% data.length;
        }

    }
}
