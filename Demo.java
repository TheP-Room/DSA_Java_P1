import java.util.*;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
//        Array items = new Array(3);
//        Array otherItems = new Array(4);
//        items.insert(1);
//        items.insert(2);
//        items.insert(3);
//        items.insert(4);
//        items.insert(5);
//        items.removeAt(2);
//        otherItems.insert(6);
//        otherItems.insert(3);
//        otherItems.insert(7);
//        otherItems.insert(4);
//        items.intersect(otherItems).print();
//        System.out.println("Max : "+items.max());
//        items.reverse();
//        items.insertAt(31,3);
//        items.insertAt(32,1);
//        items.print();


//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst(12);
//        linkedList.addFirst(13);
//        linkedList.addLast(15);
//        linkedList.addLast(16);
//        linkedList.addLast(19);
//        System.out.println(linkedList.size());
//        System.out.println(Arrays.toString(linkedList.toArray()));
//        linkedList.reverse();
//        System.out.println(Arrays.toString(linkedList.toArray()));
//        System.out.println(linkedList.getKThFromEnd(4));
//        linkedList.printMiddle();
//        System.out.println(linkedList.hasLoop());

//        var reversed = StringReverser.reverse("abcd");
//        System.out.println(reversed);
//        System.out.println((int)'[');
//        System.out.println((char)42);
//        System.out.println(BalancedExpression.isBalanced("()*({12+{<23>}})"));

//        MinStack stack = new MinStack();
//        stack.push(13);
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//        System.out.println(stack.min());
//        System.out.println(stack.pop());
//        System.out.println(stack.min());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack);

//        TwoStacks stacks = new TwoStacks();
//        stacks.push1(13);
//        stacks.push1(16);
//        stacks.push1(18);
//        stacks.push1(19);
//        stacks.push2(21);
//        stacks.push2(22);
//        stacks.push2(23);
//        stacks.push2(24);
//        System.out.println(stacks.pop1());
//        System.out.println(stacks.pop2());
//        System.out.println(stacks.peek1());
//        System.out.println(stacks.peek2());
//        System.out.println(stacks.isEmpty1());
//        System.out.println(stacks.isEmpty2());
//        System.out.println(stacks.isFull1());
//        System.out.println(stacks.isFull2());
//        System.out.println(stacks);

//        StackLinked stackLinked = new StackLinked();
//        stackLinked.push(12);
//        stackLinked.push(7);
//        stackLinked.push(10);
//        stackLinked.push(6);
//        System.out.println(stackLinked.getMin());
//        System.out.println(stackLinked.pop());
//        System.out.println(stackLinked.getMin());
//        System.out.println(stackLinked.peek());
//        System.out.println(stackLinked.isEmpty());
//        System.out.println(stackLinked);

//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverse(queue);
//        System.out.println(queue);
//    }
//
//    public static void reverse(Queue<Integer> queue){
//        Stack<Integer> stack = new Stack<>();
//        while (!queue.isEmpty())
//            stack.push(queue.remove());
//        while (!stack.isEmpty())
//            queue.add(stack.pop());


//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        arrayQueue.enqueue(13);
//        arrayQueue.enqueue(14);
//        arrayQueue.enqueue(15);
//        arrayQueue.enqueue(16);
//        System.out.println(arrayQueue.dequeue());
//        System.out.println(arrayQueue.dequeue());
//        arrayQueue.enqueue(17);
//        arrayQueue.enqueue(18);
//        arrayQueue.enqueue(19);
//        System.out.println(arrayQueue);

//        StackQueue stackQueue = new StackQueue();
//        stackQueue.enqueue(12);
//        stackQueue.enqueue(13);
//        stackQueue.enqueue(14);
//        stackQueue.enqueue(15);
//        System.out.println(stackQueue.dequeue());
//        System.out.println(stackQueue.peek());
//        System.out.println(stackQueue.isEmpty());
//        System.out.println(stackQueue);

//        PriorityQueue priorityQueue = new PriorityQueue();
//        priorityQueue.enqueue(12);
//        priorityQueue.enqueue(9);
//        priorityQueue.enqueue(14);
//        priorityQueue.enqueue(3);
//        System.out.println(priorityQueue);
//        priorityQueue.reverseUntil(3);
//        System.out.println();
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.dequeue());
//        System.out.println();
//        System.out.println(priorityQueue.isEmpty());

//        LinkedQueue linkedQueue = new LinkedQueue();
//        linkedQueue.enqueue(12);
//        linkedQueue.enqueue(13);
//        linkedQueue.enqueue(14);
//        linkedQueue.enqueue(15);
//        System.out.println(linkedQueue);
//        System.out.println(linkedQueue.size());
//        System.out.println(linkedQueue.dequeue());
//        System.out.println(linkedQueue.peek());
//        System.out.println(linkedQueue.size());
//        System.out.println(linkedQueue.isEmpty());
//        System.out.println(linkedQueue);

//        StackFromQueue stackFromQueue = new StackFromQueue();
//        stackFromQueue.push(12);
//        stackFromQueue.push(13);
//        stackFromQueue.push(14);
//        System.out.println(stackFromQueue);
//        System.out.println(stackFromQueue.pop());
//        System.out.println(stackFromQueue);
//        System.out.println(stackFromQueue.peek());

//        fNonRepeated("abqqcd abc");
//        fRepeated("abqcd aqbc");

//        HashTable table = new HashTable();
//        table.put(1,"a");
//        table.put(2,"b");
//        table.put(3,"c");
//        table.put(5,"d");
//        table.put(5,"e");
//        table.put(10,"f");
//        System.out.println(table.get(10));
//        table.remove(5);

//        int[] list = {1,2,1,3,3,3,3,3,4,4,4,4,4,4,4,1,4,5,5};
//        System.out.println(mostFrequent(list));

//        int[] list = {1, 7, 5, 9, 2, 12, 3};
//        System.out.println(countPairsWithDiff(list,2));

//        int[] list = {2,7,11,15};
//        System.out.println(indicesToSum(list,9));

//        HashTableLinearProbing linearProbing = new HashTableLinearProbing();
//        linearProbing.put(1,"a");
//        linearProbing.put(2,"b");
//        linearProbing.put(1,"c");
//        linearProbing.put(4,"d");
//        System.out.println(linearProbing.get(1));
//        System.out.println(linearProbing.getSize());
//        linearProbing.remove(1);
//        System.out.println(linearProbing.getSize());

    }

    public static void fNonRepeated(String sentence){
        Map<Character, Integer> map = new HashMap<>();
        for (char alpha : sentence.toLowerCase().toCharArray()) {
            if (alpha == ' ')
                continue;
            if (map.containsKey(alpha)){
                map.remove(alpha);
                continue;
            }
            map.put(alpha, 1);
        }
        System.out.println(map.keySet().toArray()[0]);
    }

    public static void fRepeated(String sentence){
        Set<Character> set = new HashSet<>();
        for (char alpha : sentence.toCharArray()){
            if (set.contains(alpha)) {
                System.out.println(alpha);
                break;
            }
            set.add(alpha);
        }
    }

    public static int mostFrequent(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array)
            if (map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i, 1);
        int mostFrequent = 0;
        for (int value : map.keySet())
            if (mostFrequent < map.get(value))
                mostFrequent = value;
        return mostFrequent;
    }

    public static int countPairsWithDiff(int[] array, int desiredDiff){
        int pairCount = 0;
        for (int i = 0; i< array.length; i++){
            for (int j = i+1; j< array.length; j++){
                if (Math.abs(array[i]-array[j]) == desiredDiff)
                    pairCount++;
            }
        }
        return pairCount;
    }

    public static String indicesToSum(int[] array, int desiredSum){
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i] + array[j] == desiredSum)
                    return "[ "+i+", "+j+" ]";
            }
        }
        return null;
    }
}
