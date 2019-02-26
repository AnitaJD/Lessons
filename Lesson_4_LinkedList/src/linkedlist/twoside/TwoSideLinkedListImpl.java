package linkedlist.twoside;

import linkedlist.Entry;
import linkedlist.SimpleLinkedListImpl;

public class TwoSideLinkedListImpl <E> extends SimpleLinkedListImpl <E> implements TwoSideLinkedList <E> {

    private Entry<E> lastElement;


    @Override
    public void insertLeft(E value) {
        super.insert(value);
        if (getSize() == 1){
            lastElement = firstElement;
        }
    }

    @Override
    public void insertRight(E value) {
        Entry<E> newElement = new Entry<>(value);

        if (isEmty()){
            firstElement = newElement;
        }
        else {
            lastElement.setNext(newElement);
        }

        lastElement.setNext(newElement);
        lastElement = newElement;
        currentSize++;
    }

    @Override
    public E removeLeft() {
        E removedElement = super.remove();
        if (isEmty()){
            lastElement = null;
        }
        return removedElement;
    }

    @Override
    public boolean remove(E value) {
        Entry<E> current = firstElement;
        Entry<E> previous = null;

        while (current != null){
            if (current.getValue().equals(value)){
                break;
            }
            previous = current;
            current = current.getNext();
        }

        if (current == null){
            return false;
        }

        if (current == firstElement){
            firstElement = firstElement.getNext();
        }
        else if (current == lastElement){
            lastElement = previous;
            previous.setNext(current.getNext());
        }
        else {
            previous.setNext(current.getNext());
        }

        currentSize--;

        return true;
    }
}
