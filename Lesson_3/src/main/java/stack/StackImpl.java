package stack;

public class StackImpl<E> implements Stack<E> {

    private E[] data;
    private int size;

    public StackImpl (int maxSize){
        this.data = (E[]) new Object();
        this.size = 0;
    }

    @Override
    public void push(E value) {
        this.data[size++] = value;
    }

    @Override
    public E pop() {
        return data [--size];
    }

    @Override
    public E peek() {
        return data [size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size ==0;
    }
}
