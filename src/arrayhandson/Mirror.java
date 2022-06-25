package arrayhandson;

public class Mirror {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print(mat);
        mirror(mat);
        print(mat);
    }

    static void mirror(int[][] mat) {
        int curRow = 1;
        int n = 1;

        while (curRow < mat.length) {
            for (int row = curRow, col = 0; col < n; col++) {
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
            curRow++;
            n++;
        }
    }

    static void print(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
