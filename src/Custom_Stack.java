public class Custom_Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public Custom_Stack(){
        this(DEFAULT_SIZE);
    }
    public Custom_Stack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Stack_Exception{
        if(isempty()){
            throw new Stack_Exception("stack is empty");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Stack_Exception{
        if(isempty()){
            throw new Stack_Exception("cannot peek from stack that is empty");
        }
        return data[ptr];
    }
    private boolean isfull(){
        return ptr==data.length-1; // ptr is at the last index
    }
    private boolean isempty(){
        return ptr==-1;
    }
}
