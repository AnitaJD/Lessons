import java.util.Arrays;

public class ArrayImpl<E extends Object & Comparable<? super E>> implements Array <E> {

    private static final int DEFAULT_CAPACITY = 16;
    protected static final int IVALID_INDEX = -1;

    protected E[] data;
    protected int currentSize;

    public ArrayImpl (){
    this(DEFAULT_CAPACITY);
    }

    public ArrayImpl(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public void add(E value) {
        checkGrow();
        this.data[currentSize++] = value;
    }

    protected void checkGrow() {
        if (currentSize < data.length)
            return;

        data = Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public boolean remove(E value) {
        return removeByIndex(indexOf(value));
    }

    @Override
    public void remove(int index) {
        boolean result = removeByIndex(index);
        if ( !result ) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    private boolean removeByIndex (int index){
        if ( index == IVALID_INDEX || index <0 || index >= currentSize)
            return false;

        for (int i = index; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }
        data[currentSize - 1] = null;
        currentSize--;

        return true;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != -1 ? true : false;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i].equals(value)){
                return i;
            }
        }
        return IVALID_INDEX;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void sortBubble() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = 0; j < currentSize - 1 - i ; j++) {
                if (data[j].compareTo(data[j + 1]) > 0){
                    exchange(j, j + 1);
                }
            }
        }
    }

    @Override
    public void sortSelect() {
        for (int i = 0; i < currentSize - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (data[j].compareTo(data[minIndex]) < 0){
                    minIndex = j;
                }
            }
            exchange(minIndex, i);
        }

    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < currentSize ; i++) {
            E temp = data [i];

            int in = i;
            while(in > 0 && data[in - 1].compareTo(temp) >= 0){
                data [in] = data [in - 1];
                in--;
            }
            data[in] = temp;
        }
    }

    private void exchange(int index1, int index2){
        E tempt = data[index1];
        data[index1] = data[index2];
        data[index2] = tempt;
    }
}
