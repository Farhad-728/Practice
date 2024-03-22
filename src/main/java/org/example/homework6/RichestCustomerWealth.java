package org.example.homework6;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int account : customer) {
                wealth += account;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 4, 1}};
        maximumWealth(accounts);
    }
}