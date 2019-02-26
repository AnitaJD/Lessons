package linkedlist;

public interface LinkedList <E>{

    void insert (E value);
    E remove ();
    boolean remove (E value);

    boolean isEmty ();
    int getSize();

    boolean find (E value);

    void display();

    E getFirstElement();

    Entry<E> getFirst();


}
