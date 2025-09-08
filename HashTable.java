public class HashTable {

    private class Entry{
        private int key;
        private String value;
        private int count;

        public Entry(int key, String value, int count){
            this.key = key;
            this.value = value;
            this.count = count;
        }
    }

    private class LinkList{
        private class Node{
            private Entry entry;
            private Node next;

            public Node(Entry entry){
                this.entry = entry;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public void addLast(Entry entry){
            var node = new Node(entry);
            if (head == null)
                head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void removeAt(int count){
            var current = head;
            if (count == 0)
                head = current.next;
            if (count+1 == size){
                while (current != null){
                    if (current.next == tail){
                        current.next = null;
                        tail = current;
                    }
                    current = current.next;
                }
            }
            else {
                for (int i = 0 ; i<count-1 ; i++)
                    current = current.next;
                var desiredNext = current.next.next;
                current.next.next = null;
                current.next = desiredNext;
            }
            size--;
        }

    }

    private LinkList[] list;
    private Entry entry;

    public HashTable(){
        list = new LinkList[5];
        for (int i = 0; i<5; i++)
            list[i] = new LinkList();
    }

    public void put(int key, String value){
        var currentCount = getCount(key);
        entry = new Entry(key,value,currentCount);
        var hashedKey = hashCode(key);
        var current = list[hashedKey].head;
        while (current != null){
            if (current.entry.count == currentCount) {
                current.entry.value = value;
                return;
            }
            current = current.next;
        }
        list[hashedKey].addLast(entry);
    }

    public String get(int key){
        var hashedKey = hashCode(key);
        var current = list[hashedKey].head;
        for (int i = 0; i<getCount(key); i++)
            current = current.next;
        return current.entry.value;
    }

    public void remove(int key){
        var hashedKey = hashCode(key);
        list[hashedKey].removeAt(getCount(key));
    }

    private int hashCode(int key){
        return key%5;
    }

    private int getCount(int key){
        int count = 0;
        while (key > 5){
            key = key / 5;
            count += 1;
        }
        return count;
    }
}