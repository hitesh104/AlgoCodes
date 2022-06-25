package array;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(8);
        for (int num = 1; num <= 100; num++) {
            list.add(num);
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
