import java.util.Arrays;

public class StackLinked {
    private final LinkedList linkedList = new LinkedList();
    private int min;
    private int lastMin;

    public void push(int item){
        if (linkedList.size() == 0)
            min = item;
        lastMin = min;
        if (item < min) min = item;
        linkedList.addLast(item);
    }

    public int pop(){
        var value = linkedList.getKThFromEnd(1);
        linkedList.removeLast();
        if (value == min) min = lastMin;
        return value;
    }

    public int peek(){
        return linkedList.getKThFromEnd(1);
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public int getMin(){
        return min;
    }

    @Override
    public String toString(){
        return Arrays.toString(linkedList.toArray());
    }
}
