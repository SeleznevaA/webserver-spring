package ru.pflb.webserver;

public class RandomGenerator {
    private int from;
    private int to;

    public RandomGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getRandom() {
        return from + (int)(Math.random() * ((to - from) + 1));
    }
}
