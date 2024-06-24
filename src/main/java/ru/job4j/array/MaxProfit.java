package ru.job4j.array;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
    int rsl = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i - 1] < prices[i]) {
          rsl+= prices[i - 1] - prices[i];
      }
    }
    return Math.abs(rsl);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(maxProfit(array));
    }
}
