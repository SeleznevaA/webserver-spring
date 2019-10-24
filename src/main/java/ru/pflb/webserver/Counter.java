package ru.pflb.webserver;

public class Counter {
    private final int start;
    private final int counter;
    private final int current;

    public Counter(int start, int counter, int current) {
        this.start = start;
        this.counter = counter;
        this.current = current;
    }

    public int getStart() {
        return start;
    }

    public int getCounter() {
        return counter;
    }

    public int getCurrent() {
        return current;
    }
}
