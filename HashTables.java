public class HashTables {
    /*
        In java they are called hashmap and are same as dictionary in python
        they are mostly used in places where we need to search for something in fastest manner

        this is because the hashmap will pass key to hash function and it will tell it where to
        store the object.
        key -> hash function -> address -> inside address (value object)

        we use hashtable to store key:value pair
        the operations supported by hashtables are
        insert() - O(1) or put(key, value)
        lookup() - O(1)
        delete() - O(1) or remove(key)
        get(key) - returns value for key
        containsKey() - O(1) or containsValue() - O(n)
        this is because for the key operation our hashmap will pass the key to hash function and
        it will figure out where this object will be stored and if there is an object at
        location and in value the hash function do not have anything and it have to iterate
        over all objects to find the value

        in worst case scenario these operations run in O(n) but it rarely happens
        Map<Integer, String> map = new HashMap<>();
        here Map is an interface and HashMap is class implementing interface

        hashmap allows null keys and null values

        .entrySet() returns key value pairs
        .keySet() return list of key

        There is a similar data structure to map i.e. set which only contains key but similar
        to maps it does not allow duplicate keys
        Set<Integer> set = new HashSet<>();
        here Set is an interface and HashSet is class implementing interface

        internally we use data structure like array to store keys value where keys represent
        index value for the stored value

        here comes the hashing or hash function in which we convert the key into usable indexes
        through different means such as dividing or remainder or any known method that works

        in java every object has a method called hashCode() which returns a hash value based on
        the value assigned to object

        initially all slots/buckets/indexes in a hashtable are set to null

        during hashing we can encounter situations where same hash is generated for some
        different keys this is called collision, we can't store different values at same index
        in an array so to solve this problem we uses different approaches such as
        chaining or open addressing

        in chaining each cell in arrays points to a linked list and item every time is added
        to last in that linked list

        in open addressing we simply find a different empty slot to store the value

        there are different open addressing algorithms we can use

        linear probing - probing means searching if there is a collision then we move to next
            slot/bucket/index one by one to look for empty space to store the value
        if we can't find any empty slot this means that the table is full and this is one of
        drawbacks of open addressing but in chaining this situation doesn't arises as linked
        list grows when value is added
        in linear probing we use hash(key) + i where i is any loop variable which goes from 0
        to range of index using modulo
        there is also another problem with linear probing ie formation of cluster means no
        empty slots in series to an extent which directly slows down the algorithm

        quadratic probing - in this algorithm we use i^2 to jump to slots making the steps
            bigger and overcoming the cluster situation, but here we have another complication
        ie we may end up getting back to the beginning of array and repeat the same steps and
        have an infinite loop

        double hashing - in this algorithm we use another hash function to determine the steps
            to be taken to search for an empty slot, for eg a hash function such as
        prime - (key%prime) will return a hash and then we use this hash to specify the
        value of i, here prime is a prime no smaller than table size
        (hash1(key) + i*(hash2(key))%tableSize
        if provided slot is also full then we simply increment i to find next slot
    */
}
