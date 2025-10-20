public class LinkedList<T>
{
    // Custom made generic linked list
    private class Node{
        private T item;
        private Node next;
        
        public Node(T item) {
            this.item = item;
        }
    }
    
    private Node head,tail;
    private int size;
    
    public void addLast(T item) {
        Node node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    
    public void addFirst(T item) {
        Node node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }
    
    private void checkNull() {
        if (head == null)
            throw new IllegalStateException();
    }
    
    public int indexOf(T item) {
        checkNull();
        var current = head;
        int index = 0;
        while (current != null) {
            if (current.item == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    
    public boolean contains(T item) {
        checkNull();
        return indexOf(item) > -1;
    }
    
    public void removeFirst() {
        checkNull();
        var newHead = head.next;
        head.next = null;
        head = newHead;
        size--;
    }
    
    public void removeLast() {
        checkNull();
        var current = head;
        while (current.next != null) {
            if (current.next.next == null) {
                current.next = null;
                tail = current;
                break;
            }
            current = current.next;
        }
        size--;
    }
    
    public int getSize() {
        return size;
    }
    
    public Array<T> toArray() {
        checkNull();
        var current = head;
        Array<T> result = new Array();
        while (current != null) {
            result.insert(current.item);
            current = current.next;
        }
        return result;
    }
    
    public void reverse() {
        checkNull();
        var previous = head;
        var current = head.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
    
    public T kThNodeFromEnd(int k) {
        checkNull();
        if (k <= 0 || k > size)
            throw new IllegalArgumentException();
        var slow = head;
        var fast = head.next;
        for (int i = 0; i<k-1; i++){
            if (fast == null)
                break;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.item;
    }
    
    public void printMiddle() {
        checkNull();
        var slow = head;
        var fast = head.next;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null)
                break;
        }
        System.out.println((fast == null) ? slow.item : slow.item+", "+
            slow.next.item);
    }
    
    public boolean hasLoop() {
        checkNull();
        var slow = head;
        var fast = head.next;
        while (fast != null) {
            if (fast.next == slow)
                return true;
            slow = slow.next;
            fast = fast.next;
        }
        return false;
    }
    
    public void print() {
        checkNull();
        var current = head;
        while (current != null) {
            System.out.print(current.item+", ");
            current = current.next;
        }
        System.out.println();
    }
}
