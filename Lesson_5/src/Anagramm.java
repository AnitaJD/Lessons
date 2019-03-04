import java.util.HashSet;
import java.util.Set;

public class Anagramm {

    public static void main(String[] args) {
        Anagramm anagramm = new Anagramm("abcde");
        anagramm.getAnagramm();
    }


    private Set<String> result = new HashSet<>();
    private char [] chars;

    public Anagramm (String word){
        this.chars = word.toCharArray();
    }

    public void getAnagramm(){
        result.clear();
        getAnagramm(chars.length);
        for (String anagramm : result){
            System.out.println(anagramm);
        }
    }

    private void getAnagramm (int currentsize){
        if (currentsize == 1){
            return;
        }

        for (int i = 0; i < currentsize; i++) {
            getAnagramm(currentsize - 1);
            result.add(new String(chars));
//            if (currentsize == 2) {
//                display();
//            }
            rotate(currentsize);
        }
    }

    private void rotate(int currentsize) {
        int pos = chars.length - currentsize; // фиксируем позицию
        char temp = chars[pos]; //букву фиксируем
        for (int i = pos + 1; i < chars.length; i++) {
            chars [i - 1] = chars [i];
        }
        chars [chars.length - 1] = temp;// записываем в последнюю позицию что изначально было на chars[pos]
    }

    private void display(){
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
