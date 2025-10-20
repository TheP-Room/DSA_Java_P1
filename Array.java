import java.util.Arrays;

public class Array<T>
{
    private T[] array = (T[]) new Object[5];
    private int count;
    private int size = 5;
    
    private void resizeIfRequired() {
        if (count == size) {
            var temp = (T[]) new Object[2 * size];
            for (int i = 0; i<count; i++)
                temp[i] = array[i];
            array = temp;
            size *= 2;
        }
    }
    
    public void insert(T item) {
        resizeIfRequired();
        array[count++] = item;
    }
    
    private void validateIndex(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
    }
    
    public void removeAt(int index) {
        validateIndex(index);
        for (int i = index; i<count; i++)
            array[i] = array[i+1];
        count--;
    }
    
    public int indexOf(T item) {
        for (int i = 0; i<count ; i++)
            if (array[i] == item)
                return i;
        return -1;
    }
    
    public int getSize() {
        return count;
    }
    
    public T itemAt(int index) {
        validateIndex(index);
        return array[index];
    }
    
    private T[] getArray() {
        return array;
    }
    
    public Array intersect(Array other) {
        Array minInTwo = (count > other.getSize()) ? other : this;
        Array intersection = new Array();
        T[] toIterate = (minInTwo == this) ? array : (T[])other.getArray();
        Array toCheck = (toIterate == array) ? other : this;
        for (var item : toIterate)
            if (toCheck.indexOf(item) > -1)
                intersection.insert(item);
        return (intersection.getSize() == 0) ? null : intersection;
    }
    
    public void reverse() {
        var temp = (T[]) new Object[size];
        for (int i = 0 ; i<count; i++)
            temp[count-i-1] = array[i];
        array = temp;
    }
    
    public void insertAt(T item, int index) {
        validateIndex(index);
        resizeIfRequired();
        for (int i = count; i>index; i--)
            array[i] = array[i-1];
        array[index] = item;
        count++;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array,0,count));
    }
}
