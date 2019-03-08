public class Homework6 {

    public static void main(String[] args) {

        Tree<Integer> treeH = new TreeImpl<>();

        for (int i = 0; i <= 8; i++) {
            int a = (int) (Math.random()*(40 + 1) - 20);
            treeH.add(a);
        }
        treeH.display();
    }
}
