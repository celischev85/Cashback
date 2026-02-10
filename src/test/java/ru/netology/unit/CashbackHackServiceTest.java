package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {


    @Test
    void testRemain_notReached() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    void testRemain_exactlyReached() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        assertEquals(0, service.remain(amount));


    }

    @Test
    void testRemain_moreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expected = 500;
        assertEquals(expected, service.remain(amount));
    }
}