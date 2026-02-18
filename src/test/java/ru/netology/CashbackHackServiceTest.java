package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    public void testAddition() {
        int actual = 2 + 2;
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testStringContains() {
        String text = "Hello, world!";
        Assert.assertTrue(text.contains("world"));
    }

    @Test
    public void testRemain_notReached() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        Assert.assertEquals(service.remain(amount), expected);
    }


    @Test
    public void testRemain_exactlyReached(int expected) {
        ru.netology.CashbackHackService service = new ru.netology.CashbackHackService();
        int amount = 1000;
        Assert.assertEquals(service.remain(amount), expected);


    }

    @Test
    public void testRemain_moreThanBoundary() {
        ru.netology.CashbackHackService service = new ru.netology.CashbackHackService();
        int amount = 2500;
        int expected = 500;
        Assert.assertEquals(service.remain(amount), expected);
    }


}



