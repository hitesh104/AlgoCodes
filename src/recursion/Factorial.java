package recursion;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(factorial(1));
//        System.out.println(factorial(2));
//        System.out.println(factorial(3));
//        System.out.println(factorial(4));
//        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }

    static int factorial(int num) {
        if (num == 1 || num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}
