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

    public int twos() {
        return sumForValue(2);
    }

    public int ones() {
        return sumForValue(1);
    }

    public int threes() {
        return sumForValue(3);
    }

    public int Fours() {
        return sumForValue(4);
    }

    public int Fives() {
        return sumForValue(5);
    }

    public int Sixes() {
        return sumForValue(6);
    }

    public int chances() {
        return Arrays.stream(values).sum();
    }

    private int sumForValue(int value) {
        return Arrays.stream(values).filter(
                value1 -> value1 == value
        ).sum();
    }

    public int pair() {
        Set<Integer> pairs = getPairs();
        if (pairs.size() > 0) {
            return pairs.stream().max(Comparator.comparingInt(o -> o)).get() * 2;
        }
        return 0;
    }

    public int twoPairs() {
        Set<Integer> pairs = getPairs();
        if (pairs.size() > 1) {
            return pairs.stream().reduce(0,
                    (sum, value) -> sum + (value * 2)
            );
        }
        return 0;
    }

    private Set<Integer> getPairs() {
        Set<Integer> pairs = new HashSet<>(Collections.emptySet());
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++)
                if (j != i && values[j] == values[i])
                    pairs.add(values[j]);
        }
        return pairs;
    }

    public int threeOfAKind() {
        return getKeyForMatchingDuplicatesCount(getDuplicatesMap(), 3) * 3;
    }

    public int fourOfAKind() {
        return getKeyForMatchingDuplicatesCount(getDuplicatesMap(), 4) * 4;
    }

    public int fullHouse() {
        int threeOfAKindValue = getKeyForMatchingDuplicatesCount(getDuplicatesMap(), 3);
        Set<Integer> pairs = getPairs();
        int pair = pairs.stream().filter(
                pairValue -> pairValue != threeOfAKindValue
        ).findAny().orElse(0);
        if (pair != 0 && threeOfAKindValue != 0) {
            return pair * 2 + threeOfAKindValue * 3;
        }
        return 0;
    }

    public int smallStraight() {
        List<Integer> smallStraightValues = List.of(1, 2, 3, 4, 5);
        if (isPerfectMatch(smallStraightValues)) {
            return 15;
        }
        return 0;
    }

    public int largeStraight() {
        List<Integer> largeStraightValues = List.of(2, 3, 4, 5, 6);
        if (isPerfectMatch(largeStraightValues)) {
            return 20;
        }
        return 0;
    }

    private boolean isPerfectMatch(List<Integer> valuesToMatch) {
        return valuesToMatch.stream().allMatch(
                valueToMatch ->
                        Arrays.stream(values).anyMatch(value -> value == valueToMatch)
        );
    }

    public int yatzy() {
        boolean isYatzy = getKeyForMatchingDuplicatesCount(getDuplicatesMap(), 5) != 0;
        return isYatzy ? 50 : 0;
    }

    private Integer getKeyForMatchingDuplicatesCount(Map<Integer, Integer> duplicatesCount, int wantedDuplicateCount) {
        return duplicatesCount.entrySet().stream().filter(
                integerIntegerEntry -> integerIntegerEntry.getValue() > wantedDuplicateCount - 1
        ).findFirst().map(Map.Entry::getKey).orElse(0);
    }

    private Map<Integer, Integer> getDuplicatesMap() {
        Map<Integer, Integer> duplicatesCount = new HashMap<>();
        Arrays.stream(values).forEach(
                value -> {
                    if (duplicatesCount.containsKey(value)) {
                        duplicatesCount.put(value, duplicatesCount.get(value) + 1);
                    } else {
                        duplicatesCount.put(value, 1);
                    }
                }
        );
        return duplicatesCount;
    }

}