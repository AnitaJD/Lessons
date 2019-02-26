package linkedlist.twoside;

import linkedlist.LinkedList;

public interface TwoSideLinkedList <E> extends LinkedList <E> {

    void insertLeft (E value);
    void insertRight (E value);

    E removeLeft();
}
