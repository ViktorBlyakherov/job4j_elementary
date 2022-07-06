package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int balance = money - price;
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (balance >= coins[i]) {
                size++;
                rsl[size - 1] = coins[i];
                balance = balance - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
