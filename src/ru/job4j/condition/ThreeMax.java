package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = 0;

           if (first > second && first > third) {
               result = first;
           }
           if (second > first && second > third) {
               result = second;
           }
           if (third > first && third > second) {
               result = third;
           }
           if ((first == second) && (second == third)) {
               result = first;
        }
           if ((first == second) && (third < second)){
               result = second;
        }
        if ((first == third) && (third > second)) {
            result = first;
        }
        if ((second == third) && (third > first)) {
            result = third;
        }
               return result;
    }
}