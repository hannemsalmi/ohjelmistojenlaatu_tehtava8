package test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest(name = "Aika {0} sekuntia -> {1}")
    @CsvSource({
        "0, '0:00:00'",
        "1, '0:00:01'",
        "10, '0:00:10'",
        "60, '0:01:00'",
        "600, '0:10:00'",
        "3600, '1:00:00'",
        "3665, '1:01:05'",
        "31999, '8:53:19'",
        "32001, '-1'",
        "-1, '-1'",
    })
    public void testSecToTime(int seconds, String expected) {
        String result = Timeutils.TimeUtils.secToTime(seconds);
        assertEquals(expected, result);
    }
}