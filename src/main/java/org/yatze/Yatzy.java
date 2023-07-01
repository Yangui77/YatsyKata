package org.yatze;

public class Yatzy {

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        return sum(2, d1, d2, d3, d4, d5);
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        return sum(1, d1, d2, d3, d4, d5);
    }

    private static int sum(int value, int d1, int d2, int d3, int d4, int d5) {
        int sum = 0;
        if (d1 == value) {
            sum += value;
        }
        if (d2 == value) {
            sum += value;
        }
        if (d3 == value) {
            sum += value;
        }
        if (d4 == value) {
            sum += value;
        }
        if (d5 == value) {
            sum += value;
        }
        return sum;
    }
}