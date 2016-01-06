package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * <p>
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * <p>
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 *
 * @see <a href="https://leetcode.com/problems/coin-change/">Coin Change</a>
 * {@link }
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        int m = coins.length;
        int[] minCoins = new int[amount + 1];

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            int currentMinCoins = -1;
            for (int i = 0; i < m; i++) {
                int coin = coins[i];
                int coinsNeeded = (currentAmount < coin) ? -1 : minCoins[currentAmount - coin];

                if (coinsNeeded != -1 && (currentMinCoins == -1 || coinsNeeded + 1 < currentMinCoins)) {
                    currentMinCoins = coinsNeeded + 1;
                }
            }
            minCoins[currentAmount] = currentMinCoins;
        }

        return minCoins[amount];
    }

}
