package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int bound = (array.length / 2);
        if (array.length % 2 == 0) {
            for (int i = 0; i < bound; i++) {
                int change = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = change;
            }
        } else {
              for (int i = 0; i < bound; i++) {
                int change = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = change;
            }
        }
        return array;
    }
}