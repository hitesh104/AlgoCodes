package recursionhandson;

public class Permute {
    public static void main(String[] args) {
        permute(0, "abc".toCharArray());
    }

    static void permute(int curIdx, char[] str) {
        if (curIdx >= str.length) {
            print(str);
            return;
        }

        for (int idx = curIdx; idx < str.length; idx++) {
            swap(str, curIdx, idx);
            permute(curIdx + 1, str);
            swap(str, curIdx, idx);
        }
    }

    static void swap(char[] str, int idx1, int idx2) {
        char temp = str[idx1];
        str[idx1] = str[idx2];
        str[idx2] = temp;
    }

    static void print(char[] str) {
        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();
    }
}
