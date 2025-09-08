import java.util.Arrays;

public class MinStack {
    private int[] stack = new int[3];
    private int size;
    private int min;
    private int lastMin;

    private void stretchIfRequired(){
        if (size == stack.length) {
            var temp = new int[2 * stack.length];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            stack = temp;
        }
    }

    private void pressIfRequired(){
        if (size == stack.length/2){
            var temp = new int[stack.length/2];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            stack = temp;
        }
    }

    public void push(int item){
        stretchIfRequired();
        if (size == 0) min = item;
        lastMin = min;
        if (item < min) min = item;
        stack[size++] = item;
    }

    public int pop(){
        if (size == 0)
            throw new IllegalStateException();
        int value = stack[size-1];
        size--;
        pressIfRequired();
        if (value == min)
            min = lastMin;
        return value;
    }

    public int peek(){
        if (size == 0)
            throw new IllegalStateException();
        return stack[size-1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int min(){
        return min;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(stack,0,size));
    }
}
