import java.util.Arrays;

public class LinkedQueue {
    private final LinkedList linkedList;

    public LinkedQueue(){
        linkedList = new LinkedList();
    }

    public void enqueue(int item){
        linkedList.addLast(item);
    }

    public int dequeue(){
        if (linkedList.size() == 0) throw new IllegalStateException();
        int value = linkedList.getKThFromEnd(linkedList.size());
        linkedList.removeFirst();
        return value;
    }

    public int peek(){
        return linkedList.getKThFromEnd(linkedList.size());
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public void reverse(){
        linkedList.reverse();
    }

    @Override
    public String toString(){
        return Arrays.toString(linkedList.toArray());
    }
}
