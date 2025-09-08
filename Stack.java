import java.util.Arrays;

public class Stack<T> {
    private T[] stack = (T[]) new Object[3];
    private int size;

    public int getSize(){
        return size;
    }

    public int getLength(){
        return stack.length;
    }

    private void stretchIfRequired(){
        if (size == stack.length) {
            var temp = (T[]) new Object[2 * stack.length];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            stack = temp;
        }
    }

    private void pressIfRequired(){
        if (size == stack.length/2){
            var temp = (T[]) new Object[stack.length/2];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            stack = temp;
        }
    }

    public void push(T item){
        stretchIfRequired();
        stack[size++] = item;
    }

    public T pop(){
        if (size == 0)
            throw new IllegalStateException();
        var value = stack[size-1];
        size--;
        pressIfRequired();
        return value;
    }

    public T peek(){
        if (size == 0)
            throw new IllegalStateException();
        return stack[size-1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(stack);
    }
}
