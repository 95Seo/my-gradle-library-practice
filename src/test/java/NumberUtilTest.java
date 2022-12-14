import org.junit.jupiter.api.Test;
import util.NumberUtil;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilTest {

    @Test
    void parseInt() {
        assertEquals(3, NumberUtil.parseInt("3"));
        assertEquals(0, NumberUtil.parseInt("오류"));
        assertEquals(10, NumberUtil.parseInt("010"));
    }
}