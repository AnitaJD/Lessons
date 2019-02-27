package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkIteratorApp {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();

            if(next.equals(3)){
                iterator.remove();
                continue;
            }
            System.out.print(next + " ");
        }
        System.out.println();

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            listIterator.set(next + 10);
        }

        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

        while (listIterator.hasPrevious()){
            Integer next = listIterator.previous();
            System.out.print(next + " ");
        }
    }
}
