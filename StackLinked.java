import java.util.Arrays;

public class StackLinked {
    private final LinkedList linkedList = new LinkedList();

    public void push(int item){
        linkedList.addLast(item);
    }

    public int pop(){
        var value = linkedList.getKThFromEnd(1);
        linkedList.removeLast();
        return value;
    }

    public int peek(){
        return linkedList.getKThFromEnd(1);
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(linkedList.toArray());
    }
}

