package FirstSteps;

public class Operators {
    public static void main(String[] args) {
        int sum = 1 + 2;
        System.out.println("1 + 2 = " + sum);

        int subtract = sum - 1;
        System.out.println("3 - 1 = " + subtract);

        int multiplication = subtract * 10;
        System.out.println("2 * 10 = " + multiplication);

        int divide = multiplication / 5;
        System.out.println("20 / 10 = " + divide);

        int modulo = divide % 3;
        System.out.println("4 % 3 = " + modulo);

        int result = 1;

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 10 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);
    }
}
