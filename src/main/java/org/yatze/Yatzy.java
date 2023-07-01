package org.yatze;

import java.util.*;

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

    public static int pair(int d1, int d2, int d3, int d4, int d5) {
        int[] values = new int[5];
        values[0] = d1;
        values[1] = d2;
        values[2] = d3;
        values[3] = d4;
        values[4] = d5;
        Set<Integer> pairs = getPairs(values);
        if (pairs.size() > 0) {
            return pairs.stream().max(Comparator.comparingInt(o -> o)).get() * 2;
        }
        return 0;
    }

    public static int twoPairs(int d1, int d2, int d3, int d4, int d5) {
        int[] values = new int[5];
        values[0] = d1;
        values[1] = d2;
        values[2] = d3;
        values[3] = d4;
        values[4] = d5;
        Set<Integer> pairs = getPairs(values);
        if (pairs.size() > 1) {
            return pairs.stream().reduce(0,
                    (sum, value) -> sum + (value * 2)
            );
        }
        return 0;
    }

    private static Set<Integer> getPairs(int[] values) {
        Set<Integer> pairs = new HashSet<>(Collections.emptySet());
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++)
                if (j != i && values[j] == values[i])
                    pairs.add(values[j]);
        }
        return pairs;
    }
}