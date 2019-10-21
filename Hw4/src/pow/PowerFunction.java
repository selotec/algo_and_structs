package pow;

public class PowerFunction {

    private static int power(int number, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return number;
        }
        return number * power(number, power - 1);
    }

    public static void main(String[] args) {
        System.out.println("1 в первой степени: " + power(1, 1));
        System.out.println("1 в десятой степени: " + power(1, 10));
        System.out.println("2 в квадрате: " + power(2, 2));
        System.out.println("2 в 10й: " + power(2, 10));
        System.out.println("3 в нулевой: " + power(3, 0));
    }
}
