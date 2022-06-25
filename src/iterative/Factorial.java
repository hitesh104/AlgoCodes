package iterative;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }

    static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        int fact = 1;
        for (int n = 2; n <= num; n++) {
            fact = fact * n;
        }
        return fact;
    }
}
