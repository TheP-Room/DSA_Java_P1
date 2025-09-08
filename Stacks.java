public class Stacks {
    /*
        Best way to understand stacks is to look at stack of books, we can stack a bunch
        of books but we only can view/use the top most book to get to bottom we need to
        remove the all other books one by one
        this is called LIFO (Last In First Out), this is why stacks are best to use for
        undo function

        Operations on stack
        push(item) -> add item on top
        pop() -> remove item on top
        peek() -> returns item on top without removing
        isEmpty() -> to check for empty stack

        there are no lookup operations as stacks are not meant for that

        all operations of stacks run in O(1) means constant runtime complexity


        StringBuffer is used when we need to manipulate Strings as we know that
        strings are immutable and each time we perform operations they return a new
        string hence to skip this unnecessary new string creation we use StringBuffer
        class
        StringBuilder is unsynchronized means can't be used for multithreading but
        StringBuffer is synchronized
    */
}
