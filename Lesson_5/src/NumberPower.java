public class NumberPower {

    public static void main(String[] args) {
        System.out.println(result(2,-1));
    }

    private static double result(double number, int power) {

        if (power == 0){
            return 1;

        } if (power < 0){
            return 1 / (result(number,Math.abs(power) - 1)* number);

        } else {
            return result(number,power - 1) * number;
        }
    }
    //test
}
