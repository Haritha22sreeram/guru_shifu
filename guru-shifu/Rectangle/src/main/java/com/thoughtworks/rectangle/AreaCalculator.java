package com.thoughtworks.rectangle;

public class AreaCalculator {

    private final int length;
    private final int breadth;

    private AreaCalculator(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static AreaCalculator rectangle(int length, int breadth) {
        return new AreaCalculator(length, breadth);
    }

    public int area() {
        return length * breadth;
    }

}