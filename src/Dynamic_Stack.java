public class Dynamic_Stack extends Custom_Stack_1 {
    public Dynamic_Stack(){
        super(); // calls custom_stack_1();
    }
    public Dynamic_Stack(int size){
        super(size); //calls custom_stack_1(size)
    }

    @Override
    public boolean push(int item) {
        if(this.isfull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
