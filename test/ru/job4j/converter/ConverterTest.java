package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert210RblThen3Euro() {

        int in = 210;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {

       int in = 180;
       int expected = 3;
       int out = Converter.rubleToDollar(in);
       Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert100EuroThen7000Rbl() {

        int in = 100;
        int expected = 7000;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert100DollarThen6000Rbl() {

        int in = 100;
        int expected = 6000;
        int  out = Converter.dolarToRuble(in);
        Assert.assertEquals(expected, out);

    }
/*
    @Test
    public void whenConvert100EuroThen116Euro() {

        double inr = 100;
        double expectedr = 116.6;
        double outr = Converter.euroToDollar(inr);
        Assert.assertEquals(expectedr, outr); */
}