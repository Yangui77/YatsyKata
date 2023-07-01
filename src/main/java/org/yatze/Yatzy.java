package org.yatze;

import java.util.*;

public class Yatzy {

    private static final int[] values = new int[5];
    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
        values[0] = d1;
        values[1] = d2;
        values[2] = d3;
        values[3] = d4;
        values[4] = d5;
    }

    public static int twos() {
        return sum(2);
    }

    public static int ones() {
        return sum(1);
    }

    public static int threes() {
        return sum(3);
    }

    public static int Fours() {
        return sum(4);
    }

    public static int Fives() {
        return sum(5);
    }

    public static int Sixes() {
        return sum(6);
    }

    public static int chances() {
        return Arrays.stream(values).sum();
    }


    private static int sum(int value) {
        int sum = 0;
        if (values[0] == value) {
            sum += value;
        }
        if (values[1] == value) {
            sum += value;
        }
        if (values[2] == value) {
            sum += value;
        }
        if (values[3] == value) {
            sum += value;
        }
        if (values[4] == value) {
            sum += value;
        }
        return sum;
    }

    public static int pair() {
        Set<Integer> pairs = getPairs();
        if (pairs.size() > 0) {
            return pairs.stream().max(Comparator.comparingInt(o -> o)).get() * 2;
        }
        return 0;
    }

    public static int twoPairs() {
        Set<Integer> pairs = getPairs();
        if (pairs.size() > 1) {
            return pairs.stream().reduce(0,
                    (sum, value) -> sum + (value * 2)
            );
        }
        return 0;
    }

    private static Set<Integer> getPairs() {

        Set<Integer> pairs = new HashSet<>(Collections.emptySet());
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++)
                if (j != i && values[j] == values[i])
                    pairs.add(values[j]);
        }
        return pairs;
    }
}