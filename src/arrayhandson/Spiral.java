package arrayhandson;

public class Spiral {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Mirror.print(mat);
        printSpiral(mat);
    }

    static void printSpiral(int[][] mat) {
        int fr = 0, fc = 0;
        int br = mat.length - 1, bc = mat[0].length - 1;

        int D = 4;
        int curDir = 0;

        while (fr <= br && fc <= bc) {
            switch (curDir) {
                // left -> right
                case 0:
                    for (int row = fr, col = fc; col <= bc; col++) {
                        System.out.print(mat[row][col] + " ");
                    }
                    fr++;
                    curDir = (curDir + 1) % 4;
                    break;
                 // top to bottom
                case 1:
                    for (int row = fr, col = bc; row <= br; row++) {
                        System.out.print(mat[row][col] + " ");
                    }
                    bc--;
                    curDir = (curDir + 1) % 4;
                    break;
                    // right to left
                case 2:
                    for (int row = br, col = bc; col >= fc; col--) {
                        System.out.print(mat[row][col] + " ");
                    }
                    br--;
                    curDir = (curDir + 1) % 4;
                    // bottom up direction
                case 3:
                    for (int row = br, col = fc; row >= fr; row--) {
                        System.out.print(mat[row][col] + " ");
                    }
                    fc++;
                    curDir = (curDir + 1) % 4;

            }
        }
    }
}
