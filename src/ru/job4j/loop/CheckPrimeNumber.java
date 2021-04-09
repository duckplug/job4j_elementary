package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        } else if (number > 2) {
            for (int i = 2; number > i; i++) {
                if ((number % i) == 0) {
                    prime = false;
                    break;
                }
            }

        }
        return prime;
    }
}



