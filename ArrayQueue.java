import java.util.Arrays;

public class ArrayQueue{
    private final int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int item){
        if (size == queue.length)
            throw new IllegalStateException();
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue(){
        var value = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public void reverseUntil(int k){
        if (k < 0 || k > size)
            throw new IllegalArgumentException();
        Array temp = new Array(k);
        for (int i = 0; i<k; i++)
            temp.insert(queue[i]);
        temp.reverse();
        for (int i = 0; i<k; i++)
            queue[i] = temp.itemAt(i);
    }

    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}