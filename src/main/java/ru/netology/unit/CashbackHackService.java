package ru.netology.unit;

public class CashbackHackService {
    private final int boundary = 1000;

    public int getBoundary() {
        return boundary;
    }

    public int remain(int amount) {
        return boundary - amount % boundary;


    }
}

