package stack;

public interface Stack<E> {

    void push (E value);
    E pop();
    E peek();

    int size();

    boolean isFull();
    boolean isEmpty();

}
