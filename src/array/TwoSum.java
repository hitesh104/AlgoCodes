package array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 3, 1, 6, 8};
        int N = 9;
        twoSum(arr, N);
    }

    static void twoSum(int[] arr, int N) {
        if (arr == null || arr.length <= 1)
            return;

        for (int idx = 0; idx < arr.length; idx++) {
            for (int jdx = idx + 1; jdx < arr.length; jdx++) {
                if (arr[idx] + arr[jdx] == N) {
                    System.out.println(arr[idx] + ", " + arr[jdx]);
                }
            }
        }
    }
}
