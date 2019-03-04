public class DownCount {

    private int count;

    public DownCount(int count) {
        this.count = count;
    }

    public void run() {
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }

    public void runRecursion() {
        doRun(count);
    }

    private void doRun(int count) {
        if (count <= 0) {
            return;
        }
        else {
            System.out.println(count);
            doRun(--count);
        }
    }

    public static void main(String[] args) {
        //new DownCount(5).run();
        new DownCount(5).runRecursion();
    }
}