package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        print(arr);
        reverse(arr);
        print(arr);
    }

    static void reverse(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
