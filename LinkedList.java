import java.util.NoSuchElementException;

public class LinkedList{

    // custom made linkedList

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int value){
        var node = new Node(value);
        if (head == null)
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int value){
        var node = new Node(value);
        if (head == null)
            head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int indexOf(int value){
        int index = 0;
        var currentNode = head;
        while(currentNode != null){
            if (currentNode.value == value)
                return index;
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) >= 0;
    }

    public void removeFirst(){
        if (head == null) throw new NoSuchElementException();

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        var second = head.next;
        head.next = null;
        head = second;
        size--;
    }

    public void removeLast(){
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        var current = head;
        while(current != null){
            if (current.next == tail) break;
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        if (head == null) return null;
        var array = new int[size];
        var current = head;
        int index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
//        var current = head;
//        while (current != null){ // O(n)
//            addFirst(current.value); // O(1)
//            current = current.next;
//        }
//        var newSize = size();
//        for (int i = 0; i<(newSize/2); i++) // O(n/2)
//            removeLast(); // O(n)

        if (head == null) return;
        var previous = head;
        var current = head.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    public int getKThFromEnd(int k){
//        if (k == 0 || k > size()) return -1;
//        var current = head;
//        while(true) {
//            if (indexOf(current.value) == size() - k)
//                return current.value;
//            current = current.next;
//        }

        if (head == null || head.next == null) return -1;

        var a = head;
        var b = head;
        for (int i = 0; i<k-1; i++){
            b = b.next;
            if (b == null) throw new IllegalStateException();
        }
        while (b != tail){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public void printMiddle(){
        if (head == null) return;
        var a = head;
        var b = head;
        while (b != tail && b.next != tail){
            b = b.next.next;
            a = a.next;
        }
        if (b == tail)
            System.out.println(a.value);
        else
            System.out.println(a.value + "," + a.next.value);
    }

    public boolean hasLoop(){
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}