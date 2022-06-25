package recursion;

public class PrintDirect {
    public static void main(String[] args) {
        print(1, 10);
    }

    static void print(int curNum, int n) {
        if (curNum > n)
            return;
        System.out.print(curNum + " ");
        print(curNum + 1, n);
    }
}
