public class Custom_Stack_1 {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public Custom_Stack_1(){
        this(DEFAULT_SIZE);
    }
    public Custom_Stack_1(int size){
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
    public int pop() throws Stack_Exception_1{
        if(isempty()){
            throw new Stack_Exception_1("stack is empty");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Stack_Exception_1{
        if(isempty()){
            throw new Stack_Exception_1("cannot peek from stack that is empty");
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

