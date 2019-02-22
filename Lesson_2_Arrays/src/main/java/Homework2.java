public class Homework2 {

    private int [] arr;
    private int size;

    public Homework2(int size) {
        this.size = 0;
        this.arr = new int [size];
    }

    public void delete (int value){
        int i = 0;
        for (i = 0; i < this.size ; i++) {
            if (this.arr[i] == value){
                break;
            }

            for (int j = i; j < this.size - 1 ; j++) {
                this.arr[j] = this.arr [j + 1];
            }
            this.size--;
        }
    }

    public void insert(int value){
        int i;
        for(i = 0; i < this.size; i++) {
            if (this.arr[i] > value) {
                break;
            }
        }
            for (int j = this.size; j > i; j--){
                this.arr[j] = this.arr[j - 1];
            }
            this.arr[i] = value;
            this.size++;
    }
}
