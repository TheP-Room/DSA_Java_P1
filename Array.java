public class Array {

    // Custom Made Dynamic Array

    private int[] list;
    private int count;

    public Array(int size){
        list = new int[size];
    }

    public void insert(int item){
        if (list.length == count){
            int[] temp = new int[count+1];
            for (int i = 0; i<count; i++)
                temp[i] = list[i];
            list = temp;
        }
        list[count++] = item;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) {
            if (i+1 >= count)
                continue;
            list[i] = list[i + 1];
        }

        count -= 1;
    }

    public int indexOf(int item){
        for (int i = 0; i<count; i++)
            if (list[i] == item)
                return i;
        return -1;
    }

    public int max(){
        int max = 0;
        for (int item : list)
            if(max < item)
                max = item;
        return max;
    }

    public int itemAt(int index){
        if (index >= count || index < 0) throw new IllegalArgumentException();
        return list[index];
    }

    public int getCount(){
        return count;
    }

    private int minimum(Array first,Array other){
        if (first.getCount() >= other.getCount()){
            return getCount();
        }
        return other.getCount();
    }

    public Array intersect(Array other){
        Array intersection = new Array(minimum(this,other));
        for (int items : list)
            if (other.indexOf(items) >= 0)
                intersection.insert(items);
        return intersection;
    }

    public void reverse(){
        int[] temp = new int[count];
        for (int i = 0; i<count; i++)
            temp[i] = list[count - i - 1];

        list = temp;
    }

    public void replaceAt(int item,int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        list[index] = item;
    }

    public void insertAt(int item, int index){

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        int[] temp = new int[count+1];
        int tempNo = 0;
        for (int i = 0; i<count+1; i++){
            if (i == index){
                temp[i] = item;
                tempNo++;
                continue;
            }
            temp[i] = list[i-tempNo];
        }
        count++;
        list = temp;
    }

    public void print(){
        for (int i = 0; i<count ; i++)
            System.out.println(list[i]);
    }
}
