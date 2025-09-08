import java.util.Arrays;

public class TwoStack {
    private int[] stack1 = new int[3];
    private int[] stack2 = new int[3];
    private int size1;
    private int size2;

    private int[] stretchIfRequired(int[] stack,int size){
        if (size == stack.length) {
            var temp = new int[2 * stack.length];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            return temp;
        }
        return stack;
    }

    private int[] pressIfRequired(int[] stack,int size){
        if (size == stack.length/2){
            var temp = new int[stack.length/2];
            for (int i = 0; i<size; i++)
                temp[i] = stack[i];
            return temp;
        }
        return stack;
    }

    public void push1(int item){
        stack1 = stretchIfRequired(stack1,size1);
        stack1[size1++] = item;
    }

    public void push2(int item){
        stack2 = stretchIfRequired(stack2,size2);
        stack2[size2++] = item;
    }

    public int pop1(){
        if (size1 == 0)
            throw new IllegalStateException();
        int value = stack1[size1-1];
        size1--;
        stack1 = pressIfRequired(stack1,size1);
        return value;
    }

    public int pop2(){
        if (size2 == 0)
            throw new IllegalStateException();
        int value = stack2[--size2];
        stack2 = pressIfRequired(stack2,size2);
        return value;
    }

    public int peek1(){
        if (size1 == 0)
            throw new IllegalStateException();
        return stack1[size1-1];
    }

    public int peek2(){
        if (size2 == 0)
            throw new IllegalStateException();
        return stack2[size2-1];
    }

    public boolean isEmpty1(){
        return size1 == 0;
    }

    public boolean isEmpty2(){
        return size2 == 0;
    }

    public boolean isFull1(){
        return size1 == stack1.length;
    }

    public boolean isFull2(){
        return size2 == stack2.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(stack1) + " , " + Arrays.toString(stack2);
    }
}
