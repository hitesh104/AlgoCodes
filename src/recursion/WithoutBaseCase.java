package recursion;

public class WithoutBaseCase {
    public static void main(String[] args) {
        method();
    }

    static void method() {
        System.out.println("Hello learners");
        method();
    }
}
