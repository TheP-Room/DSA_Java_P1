public class HashTableLinearProbing {

    private static class Entry{
        private final int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private final Entry[] bucket;
    private int size;

    public HashTableLinearProbing(){
        bucket = new Entry[5];
        for (int i = 0; i<5; i++)
            bucket[i] = null;
    }

    public void put(int key, String value){
        var entry = new Entry(key, value);
        var index = hash(key);
        for (var en : bucket)
            if (en != null)
                if (en.key == key) {
                    en.value = value;
                    return;
                }
        if (bucket[index] == null)
            bucket[index] = entry;
        else {
            int i = 0;
            while (bucket[index+i] != null)
                i = i+1;
            bucket[index+i] = entry;
        }
        size++;
    }

    public String get(int key){
        for (var en : bucket)
            if (en != null)
                if (en.key == key)
                    return en.value;
        return null;
    }

    public void remove(int key){
        for (int i = 0; i<bucket.length; i++){
            if (bucket[i] == null)
                continue;
            if (bucket[i].key == key)
                bucket[i] = null;
        }
        size--;
    }

    public int getSize(){ return size; }

    private int hash(int key){
        return key % bucket.length;
    }
}
