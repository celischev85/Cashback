package ru.netology.netolog;

public class CashbackService {
    private final int boundary = 1000;

    public int getBoundary() {
        return boundary;
    }

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}


