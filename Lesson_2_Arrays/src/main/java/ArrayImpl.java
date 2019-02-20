import java.util.Arrays;

public class ArrayImpl<E> implements Array <E> {

    private static final int DEFAULT_CAPACITY = 16;

    private E[] data;
    private int currentSize;

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

    private void checkGrow() {
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
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != -1 ? true : false;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i].equals(value));
            return i;
        }
        return -1;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }
}
