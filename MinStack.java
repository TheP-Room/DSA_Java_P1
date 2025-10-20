import java.util.Arrays;

public class MinStack
{
    private int[] stack = new int[5];
    private int size = 5;
    private int count;
    private int min[] = new int[size];
    private int minCount;
    
    private void resize() {
        if (count == size) {
            var temp = new int[2 * size];
            for (int i = 0; i<count; i++)
                temp[i] = stack[i];
            stack = temp;
            size *= 2;
        }
    }
    
    private void checkNull() {
        if (count == 0)
            throw new IllegalStateException();
    }
    
    public void push(int item) {
        resize();
        if (count == 0)
            min[minCount++] = item;
        else
            if (item < min[minCount-1])
                min[minCount++] = item;
        stack[count++] = item;
    }
    
    public int pop() {
        checkNull();
        var trash = stack[--count];
        if (trash == min[minCount - 1])
            minCount--;
        return trash;
    }
    
    public int peek() {
        checkNull();
        return stack[count - 1];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public int getSize() {
        return count;
    }
    
    public int getMin() {
        if (minCount == 0)
            throw new IllegalStateException();
        return min[minCount-1];
    }
    
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack,0,count));
    }
}
