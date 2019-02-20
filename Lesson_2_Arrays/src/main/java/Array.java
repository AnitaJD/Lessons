public interface Array<E extends Comparable<? super E>>{

    void add (E value);

    E get(int index);

    boolean remove (E value);
    void remove (int index);

    boolean contains (E value);
    int indexOf (E value);

    int getSize ();
    boolean isEmpty ();

    void sortBubble();
    void sortSelect();
    void sortInsert();

}
