package org.yatze;

public class Yatzy {

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        return sum(2, d1, d2, d3, d4, d5);
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        return sum(1, d1, d2, d3, d4, d5);
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        return sum(3, d1, d2, d3, d4, d5);
    }

    public static int Fours(int d1, int d2, int d3, int d4, int d5) {
        return sum(4, d1, d2, d3, d4, d5);
    }

    public static int Fives(int d1, int d2, int d3, int d4, int d5) {
        return sum(5, d1, d2, d3, d4, d5);
    }

    public static int Sixes(int d1, int d2, int d3, int d4, int d5) {
        return sum(6, d1, d2, d3, d4, d5);
    }
    public static int chances(int d1, int d2, int d3, int d4, int d5) {
        return d1 + d2 + d3 + d4 + d5;
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