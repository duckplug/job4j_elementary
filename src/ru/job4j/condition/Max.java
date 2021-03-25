package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
       int result = left > right ? left : right;
            return result;
    }

    public static void main(String[]args) {
        int msg = Max.max(33, 33);
        System.out.println(msg);
    }
}
