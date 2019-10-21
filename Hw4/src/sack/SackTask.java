package sack;

public class SackTask {
    private static int knapSack(int sackSize, int[] weights, int[] costs, int n)
    {
        if (n == 0 || sackSize == 0)
            return 0;

        if (weights[n-1] > sackSize)
            return knapSack(sackSize, weights, costs, n-1);

        else return Math.max( costs[n-1] + knapSack(sackSize-weights[n-1], weights, costs, n-1),
                knapSack(sackSize, weights, costs, n-1)
        );
    }

    public static void main(String[] args) {
        int[] val = new int[]{120, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;

        System.out.print("Решение: ");
        System.out.println(knapSack(W, wt, val, n));
    }
}
