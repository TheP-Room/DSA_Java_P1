public class StackQueue {
    private Stack<Integer> primary;
    private Stack<Integer> secondary;
    private int peek;

    public StackQueue(){
        primary = new Stack<>();
        secondary = new Stack<>();
    }

    public void enqueue(int item){
        primary.push(item);
    }

    public int dequeue(){
        while(!primary.isEmpty())
            secondary.push(primary.pop());
        int value = secondary.pop();
        peek = secondary.peek();
        primary = new Stack<>();
        while(!secondary.isEmpty())
            primary.push(secondary.pop());
        secondary = new Stack<>();
        return value;
    }

    public int peek(){
        return peek;
    }

    public boolean isEmpty(){
        return primary.isEmpty() && secondary.isEmpty();
    }

    @Override
    public String toString(){
        return primary.toString();
    }
}
