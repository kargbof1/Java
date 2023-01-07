public class BasicStack <x> {
    private x [] data;
    private int stackPointer;
    //constructor for size
    public BasicStack(){
        data = (x[]) new object[100];
        stackPointer=0;
    }
    public void push(x newItem){
        data[stackPointer++]=newItem;

    }
    public x pop(){
        //first check to make sure that the stack is not empty
        if(stackPointer ==0){throw new IllegalStateException("No more items on the stack");}

        return data[--stackPointer];
    }
    public boolean contains(X item){
        boolean found = false;
        for (int i = 0 ; i < stackPointer; i++)
        {
            if( data[i].equals(item))
            {
                found = true;
                break;

            }

        }
        return found;

    }
    public X access(X item){
        //start from the top to find the item
        while(stackPointer>0)
        {
            x tempItem = pop();
            if(item.equals(tempItem))
            {
                return tempItem;

            }

        }
        throw new IllegalArgumentException("Could not find item on the stack" + item);

    }
    public int size()
    {
        return stackPointer;
    }
    public static void main()
    {

    }
    
}
