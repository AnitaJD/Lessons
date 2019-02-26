package queue;

import java.util.ArrayList;

public class QueueMain {

    public static void main(String[] args) {
//        Queue<Integer> queue = new QueueImpl<>(5);
        Queue<Integer> queue = new PriorityQueue<>(5);
        insert(queue, 2);
        insert(queue, 1);
        insert(queue, 4);
        insert(queue, 5);
        insert(queue, 3);
        insert(queue, 222);

        ArrayList list = new ArrayList();

        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

//        System.out.println("Remove top: " + remove(queue));
//        System.out.println("Size: " + queue.size());
//        System.out.println("Peek: " + queue.peek());

        while ( !queue.isEmpty() ) {
            System.out.println(remove(queue));
        }
    }

    private static <E> E remove(Queue<E> queue) {
        if ( !queue.isEmpty() ) {
            return queue.remove();
        }
        return null;
    }

    private static <E> void insert(Queue<E> queue, E value) {
        if ( !queue.isFull() ) {
            queue.insert(value);
        }
    }
}
