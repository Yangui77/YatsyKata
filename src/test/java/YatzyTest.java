import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.yatze.Yatzy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @ParameterizedTest
    @CsvSource({
            "2, 2, 3, 4, 5, 4",
            "2, 2, 2, 4, 5, 6",
            "1, 1, 1, 1, 1, 0",
            "2, 5, 5, 5, 5, 2",
            "5, 5, 5, 1, 2, 2",
            "1, 1, 1, 1, 1, 0"
    })
    void shouldGetValidResultForTwos(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.twos(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 1",
            "1, 1, 1, 2, 2, 3",
            "1, 1, 2, 3, 3, 2",
            "2, 2, 3, 4, 5, 0",
            "1, 1, 1, 1, 1, 5",
            "2, 3, 4, 1, 1, 2"
    })
    void shouldGetValidResultForOnes(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.ones(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 3",
            "2, 3, 3, 4, 5, 6",
            "3, 4, 5, 3, 3, 9",
            "1, 1, 1, 1, 1, 0"
    })
    void shouldGetValidResultForThrees(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.threes(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 4",
            "2, 3, 3, 4, 5, 4",
            "3, 4, 5, 3, 3, 4",
            "1, 1, 1, 1, 1, 0",
            "4, 4, 2, 4, 3, 12"
    })
    void shouldGetValidResultForFours(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.Fours(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 5",
            "2, 3, 3, 4, 5, 5",
            "3, 4, 5, 3, 3, 5",
            "1, 1, 1, 1, 1, 0",
            "4, 4, 2, 4, 3, 0",
            "5, 5, 5, 5, 5, 25",
            "5, 5, 2, 1, 3, 10"
    })
    void shouldGetValidResultForFives(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.Fives(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 0",
            "2, 3, 3, 4, 5, 0",
            "3, 4, 5, 3, 6, 6",
            "1, 1, 1, 6, 6, 12",
            "4, 4, 2, 6, 1, 6",
            "5, 5, 5, 5, 6, 6",
            "5, 5, 6, 1, 3, 6"
    })
    void shouldGetValidResultForSixes(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.Sixes(d1, d2, d3, d4, d5));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 15",
            "2, 2, 3, 2, 5, 14",
            "1, 1, 1, 1, 1, 5",
            "2, 2, 2, 3, 4, 13",
            "3, 3, 3, 1, 1, 11"
    })
    void shouldGetValidResultForChances(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.chances(d1, d2, d3, d4, d5));
    }
}
