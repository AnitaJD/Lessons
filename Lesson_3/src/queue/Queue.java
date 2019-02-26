package queue;

public interface Queue<E> {

    void insert (E value);

    E remove();
    E peek();

    int size();

    boolean isFull();
    boolean isEmpty();
}
