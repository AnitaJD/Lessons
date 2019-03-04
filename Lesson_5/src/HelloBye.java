public class HelloBye {

    public static void main(String[] args) {
        hello("Artem");
    }

    private static void hello(String name) {
        println("Hello, " + name + "!");
        bye(name);
    }

    private static void bye(String name) {
        println("Bye," + name + "!");
    }

    private static void println(String text) {
        System.out.println(text);
    }
}
