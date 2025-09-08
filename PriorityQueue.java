public class PriorityQueue {
    private final Array queue;

    public PriorityQueue(){
        queue = new Array(3);
    }

    public void enqueue(int item){
        int size = queue.getCount();
        if (size == 0)
            queue.insert(item);
        else
            for (int i = 0; i< size; i++) {
                if (item <= queue.itemAt(i)) {
                    queue.insertAt(item, i);
                    break;
                }
                if (i+1 == size)
                    queue.insert(item);
            }
    }

    public int dequeue(){
        if (queue.getCount() == 0) throw new IllegalStateException();
        int value = queue.itemAt(0);
        queue.removeAt(0);
        return value;
    }

    public int peek(){
        return queue.itemAt(0);
    }

    public void reverseUntil(int k){
        if (k < 0 || k >= queue.getCount())
            throw new IllegalArgumentException();
        Array temp = new Array(k);
        for (int i = 0; i<k; i++)
            temp.insert(queue.itemAt(i));
        temp.reverse();
        for (int i = 0; i<k; i++)
            queue.replaceAt(temp.itemAt(i), i);
    }

    public boolean isEmpty(){
        return queue.getCount() == 0;
    }

    @Override
    public String toString(){
        queue.print();
        return "";
    }
}
