package recursion;

public class IndirectPrint {
    public static void main(String[] args) {
        print1(1, 10);
    }

    static void print1(int curNum, int n) {
        if (curNum > n)
            return;
        System.out.println("From P1");
        System.out.print(curNum  + " ");
        System.out.println();
        print2(curNum + 1, n);
        System.out.println();
    }

    static void print2(int curNum, int n) {
        if (curNum > n)
            return;
        System.out.println("From P2");
        System.out.print(curNum + " ");
        print2(curNum + 1, n);
    }
}
