public class LinkedLists {
    /*
        We use linked list to store list of objects in sequence but unlike arrays
        linked lists can grow or shrink automatically

        it consists of group of nodes in sequence
        node contains two pieces of data one is value and other is address of next node
        in list

        first node is called head and last node is called tail

        time complexity for various operations are as follows
        O(n) -> Lookup by value
        O(n) -> Lookup by index, unlike arrays we can't lookup using index as there
                is no index no and we have to traverse over the complete list
        O(1) -> Inserting at end
        O(1) -> Inserting at beginning
        O(n) -> Inserting at middle
        O(1) -> Deletion first node
        O(n) -> Deletion last node as we need to first find the node which stores the
                reference to last node
        O(n) -> Deletion of any middle node

        Arrays vs LinkedLists
        (in terms of space)
        arrays have a fixed size (static arrays) while linkedlist grows as per data
        dynamic arrays grows 100% or 50% by their size while linkedlists take only needed
            memory

        if you know roughly how many items are to be stored use arrays


        there are two types of linkedlists
        sinlgy -> stores value and next node address
        doubly -> stores value , next node address and previous node address

        linkedlists can be circular means the tail can point to head it can be useful
        when we need operations like looping in applications or moving cursor back to
        start from last by pressing tab
    */
}
