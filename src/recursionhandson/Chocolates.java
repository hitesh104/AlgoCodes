package recursionhandson;

public class Chocolates {
    static int extraChocolates = 0;//7
    static int totalIterations = 0;
    public static void main(String[] args) {
        int totalChocolates = 4096000;
        int W = 7;
        countExtracChocolates(totalChocolates, W);
        int totalEat = totalChocolates + extraChocolates;
        System.out.println("Total chocolates : " + totalEat);
        System.out.println("Total iterations : " + totalIterations);
    }

    static void countExtracChocolates(int curWrappers, int W) {
        System.out.println("(" + curWrappers + ", " + W + ")");
        if (curWrappers < W)
            return;
        if (curWrappers == W) {
            extraChocolates += 1;
            return;
        }

        ++totalIterations;

        extraChocolates = extraChocolates + (curWrappers / W);
        int additionalWrappers = curWrappers / W;
        additionalWrappers = additionalWrappers + (curWrappers % W);
        countExtracChocolates(additionalWrappers, W);

    }
}
