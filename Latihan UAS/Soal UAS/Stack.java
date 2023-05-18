public class Stack <T extends Displayable> {
    //kalau misalnya mau ada StackOverflowException harus ada limit ke Stacknya
    private T[] data;
    private int top;
    
    public Stack(T[] data){
        this.data = data; 
        top = data.length; 
    }

    public void push(T item){
        try{
            if (top == data.length){
                throw new StackOverflowException(); 
            } else{
                data[top] = item; 
                top += 1; 
            }
        } catch(StackOverflowException e){
            System.out.println(e.getMessage()); 
        }
    }

    public T pop(){
        T x=null;
        try {
            if (top - 1 < 0){
                throw new StackEmptyException(); 
            } else{
                x = data[top - 1]; 
                top -= 1; 
            }
        } catch (StackEmptyException e){
            System.out.println(e.getMessage()); 
        }
        return x;  
        //dia ini menghasilkan T bukan int
        //disini kalau misalnya ada StackEmptyException tetap kembalikan null
    }

    public void displayTop(){
        try{
            if (top < 1){
                throw new StackEmptyException();  
            } else{
                data[top-1].display();
            }
        }catch(StackEmptyException e){
            System.out.println(e.getMessage()); 
        }
    }

}
