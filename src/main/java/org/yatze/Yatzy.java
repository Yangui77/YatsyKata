package org.yatze;

public class Yatzy {

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        int sum = 0;
        if (d1 == 2) {
            sum += 2;
        }
        if (d2 == 2) {
            sum += 2;
        }
        if (d3 == 2) {
            sum += 2;
        }
        if (d4 == 2) {
            sum += 2;
        }
        if (d5 == 2) {
            sum += 2;
        }
        return sum;
    }
}