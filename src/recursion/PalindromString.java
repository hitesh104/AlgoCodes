package recursion;

public class PalindromString {
    static boolean palindrom;
    public static void main(String[] args) {
        System.out.println(isPalindrom("abcba"));
    }

    static boolean isPalindrom(String str) {
        palindrom = true;
        check(str, 0, str.length() - 1);
        return palindrom;
    }

    static void check(String str, int start, int end) {
        if (start > str.length() || end <= 0)
            return;
        if (start > end && !palindrom)
            return;
        if (str.charAt(start) != str.charAt(end)) {
            palindrom = false;
            return;
        }
        check(str, start + 1, end - 1);
    }
}
