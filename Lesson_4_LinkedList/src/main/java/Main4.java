import linkedlist.LinkedList;
import linkedlist.SimpleLinkedListImpl;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.remove(3);
        linkedList.remove(333);

        linkedList.display();

        System.out.println("Find 2 " + linkedList.find(2));
        System.out.println("Find 222 " + linkedList.find(222));

        linkedList.remove();
        linkedList.remove();

        linkedList.display();
    }
}
