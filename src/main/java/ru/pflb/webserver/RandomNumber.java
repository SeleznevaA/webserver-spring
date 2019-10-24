package ru.pflb.webserver;

public class RandomNumber {
    private final int from;
    private final int to;
    private final int random;

    public RandomNumber(int from, int to, int random) {
        this.from = from;
        this.to = to;
        this.random = random;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getRandom() {
        return random;
    }
}
