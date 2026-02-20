package ru.netology.netolog;

import org.junit.Assert;
import org.junit.Test;

public class CashbackServiceTest {
    @Test
    public void additionTest() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void stringNotNullTest() {
        String str = "Junit4 Test";
        Assert.assertNotNull(str);
    }

    @Test
    public void testRemain_notReached() {
        CashbackService service = new CashbackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain_exactlyReached() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain_moreThanBoundary() {
        CashbackService service = new CashbackService();
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}