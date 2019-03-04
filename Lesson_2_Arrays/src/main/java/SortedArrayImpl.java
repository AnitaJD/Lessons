public class SortedArrayImpl <E extends Object & Comparable<? super E>> extends ArrayImpl<E> {

    @Override
    public void add(E value) {
        checkGrow();

        int index;

        for (index = 0; index < currentSize; index++){
            if(data[index].compareTo(value) > 0)
                break;
        }

        for (int i = currentSize; i > index ; i--) {
            data [i] = data[i - 1];
        }

        data[index] = value;
        currentSize++;
    }

}
