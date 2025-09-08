public class StackFromQueue {
    private final LinkedQueue primary;
    private int size;

    public StackFromQueue(){
        primary = new LinkedQueue();
    }

    public void push(int item){
        primary.enqueue(item);
        size++;
    }

    public int pop(){
        primary.reverse();
        var value = primary.dequeue();
        primary.reverse();
        size--;
        return value;
    }

    public int peek(){
        return primary.peek();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        return primary.toString();
    }
}
