package ru.job4j.loop;

public class CheckPrimeNumber {
       public static boolean check(int number) {
        boolean prime = true;
           for (int i = 2; number > i; i++) {
            if ((number % i) == 0){
            prime = false;
            }
        }
        return prime;
    }
}