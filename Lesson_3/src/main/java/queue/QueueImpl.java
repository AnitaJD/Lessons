package queue;

public class QueueImpl<E> implements Queue<E> {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;

    protected E[] data;
    protected int size;

    protected int front;
    protected int rear;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.size = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insert(E value) {
        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        size++;
    }

    @Override
    public E remove() {
        E value = data[front++];
        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        size--;
        return value;
    }

    @Override
    public E peek() {
        return data[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}