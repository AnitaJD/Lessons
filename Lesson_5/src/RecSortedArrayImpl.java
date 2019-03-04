public class RecSortedArrayImpl <E extends Object & Comparable<? super E>> extends SortedArrayImpl<E> {

    @Override
    public int indexOf(E value) {
        return regBinaryFind(value, 0, currentSize);
    }

    private int regBinaryFind(E value, int low, int high){
        if (low > high){
            return IVALID_INDEX;
        }

        int mid = (low + high) / 2;
        if (data[mid].equals(value)){
            return  mid;
        }

        if ( value.compareTo(data[mid]) < 0) {
            return regBinaryFind(value, low, mid - 1);
        }
        else {
            return regBinaryFind(value, mid + 1, high);
        }
    }
}
