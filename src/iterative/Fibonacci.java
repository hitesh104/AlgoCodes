package iterative;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
    }

    static int fib(int num) {
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;
        int n1 = 0;
        int n2 = 1;
        for (int n = 3; n <= num; n++) {
            int curSum = n1 + n2;
            n1 = n2;
            n2 = curSum;
        }

        return n2;
    }
}
