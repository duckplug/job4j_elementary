package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl1 = value / 70; /* формула перевода рублей в евро. */
        return rsl1;
    }

    public static int rubleToDollar(int value) {
        int rsl2 = value / 60; /* формула перевода рублей в доллары. */
        return rsl2;
    }

     public static int euroToRuble(int value) {
        int rsl3 = 70 * value; /* формула перевода евро в рубли. */
        return rsl3;
    }

    public static int dolarToRuble(int value) {
        int rsl4 = 60 * value; /* формула перевода евро в рубли. */
        return rsl4;
    }

    public static double euroToDollar(double value) {
        double  rsl5 = 1.166 * value; /* формула перевода евро в зелень.*/
        return rsl5;
    }
    /* Можно писать сразу return value, без дабовления новой переменной rsl*/

        public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        int dollar = Converter.rubleToDollar(180);
        int etor = Converter.euroToRuble(100);
        int dtor = Converter.dolarToRuble(100);
       double etod = Converter.euroToDollar(100);

        System.out.println("210 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
        System.out.println("100 euro are " + etor + " ruble.");
        System.out.println("100 dollar are " + dtor + " ruble.");
        System.out.println("100 euro are " + etod + " dollar");

            // тест программы
            //рубли в евро

            int in = 210;
            int expected = 3;
            int out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("210 rubles are 3 euro. Test result : " + passed);

            //рубли в доллары

            in = 180;
            expected = 3;
            out = Converter.rubleToDollar(in);
            passed = expected == out;
            System.out.println("180 rubles are 3 dollar. Test result : " + passed);

            //евро в рубли

            in = 100;
            expected = 7000;
            out = Converter.euroToRuble(in);
            passed = expected == out;
            System.out.println("100 euro are 7000 ruble. Test result : " + passed);

            //доллары в рубли

            expected = 6000;
            out = Converter.dolarToRuble(in);
            passed = expected == out;
            System.out.println("100 dollar are 6000 ruble. Test result : " + passed);

            //доллары в рубли

            double inr = 100;
            double expectedr = 116.6;
            double outr = Converter.euroToDollar(inr);
            boolean passedr = expectedr == outr;
            System.out.println("100 euro are 116,6 dollar. Test result : " + passedr);

        }
}