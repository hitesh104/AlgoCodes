package array;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[10]=111;
        print(arr);
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
