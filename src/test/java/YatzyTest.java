import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.yatze.Yatzy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @ParameterizedTest
    @CsvSource({
            "2, 2, 3, 4, 5, 4"
    })
    void shouldGetValidResultForTwos(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.twos(d1, d2, d3, d4, d5));
    }


}
