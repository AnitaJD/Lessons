package linkedlist;

public class SimpleLinkedListImpl<E> implements LinkedList<E> {

    protected Entry<E> firstElement;
    protected int currentSize;

    @Override
    public void insert(E value) {
        Entry<E> newElement = new Entry<>(value); //002
        newElement.setNext(firstElement); //001 next -> 001
        firstElement = newElement; //002
        currentSize++;
    }

    @Override
    public E remove() {
        if (isEmty()){
            return null;
        }
        Entry<E> removeElement = firstElement;
        firstElement = firstElement.getNext();
        currentSize--;
        return removeElement.getValue();
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

//        if (previous == null || current == firstElement){
//            firstElement = null;
//        }

        if (current == firstElement){
            firstElement = firstElement.getNext();
        }

        else {
            previous.setNext(current.getNext());
        }

        currentSize--;
        return true;
    }

    @Override
    public boolean isEmty() {
        return firstElement == null;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean find(E value) {
        Entry<E> current = firstElement;
        while (current != null){
            if (current.getValue().equals(value)){
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public void display() {
        System.out.println("-----");
        System.out.println("display " + this.getClass().getSimpleName());

        Entry<E> current = firstElement;
        while (current != null){
            System.out.println(current);
            current = current.getNext();
        }

        System.out.println("-----");
    }

    @Override
    public E getFirstElement() {
        return firstElement.getValue();
    }

    @Override
    public Entry<E> getFirst() {
        return firstElement;
    }


}
