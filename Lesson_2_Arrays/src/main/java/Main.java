import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Homework2 arr = new Homework2 (10_000);
        Random r = new Random();
        arr.insert(r.nextInt());

    }
}
