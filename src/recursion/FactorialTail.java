package recursion;

public class FactorialTail {
    public static void main(String[] args) {
        System.out.println(factorial(4, 1));
    }

    static int factorial(int n, int output) {
        if (n == 1)
            return output;
        return factorial(n - 1, n * output);
    }
}
