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


}
