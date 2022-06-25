package recursion;

public class Power4 {
    public static void main(String[] args) {
        System.out.println(isPower4(1));
        System.out.println(isPower4(4));
        System.out.println(isPower4(40));
        System.out.println(isPower4(16));
        System.out.println(isPower4(32));
        System.out.println(isPower4(64));
    }

    static boolean isPower4(int num) {
        if (num == 1)
            return true;
        return num % 4 == 0 && isPower4(num / 4);
    }
}
