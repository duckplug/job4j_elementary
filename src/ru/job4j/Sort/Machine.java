package ru.job4j.Sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int pop = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (pop >= coins[i]) {
                pop = pop - coins[i];
                rsl[size] = coins[i];
                size = size + 1;// получается счетчик в вайл работает, пока работате условие цикла for ?
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
