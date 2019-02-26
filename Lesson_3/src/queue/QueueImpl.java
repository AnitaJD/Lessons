package queue;

public class QueueImpl<E> implements Queue<E> {

    public static final int DEFALT_REAR = -1;
    public static final int DEFALT_FRONT = 0;

    protected E []data;
    protected int size;

    protected int front;
    protected int rear;

    public QueueImpl (int maxSize){
        this.data = (E[]) new Object[maxSize];
        this.size = 0;
        this.front = DEFALT_FRONT;
        this.rear = DEFALT_REAR;
    }

    @Override
    public void insert(E value) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
