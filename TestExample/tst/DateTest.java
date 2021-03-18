import org.junit.Assert;
import org.junit.Test;

import static sun.plugin2.message.HeartbeatMessage.DEFAULT_TIMEOUT;

public class DateTest {

    @Test (timeout = DEFAULT_TIMEOUT)
    public void addDays_withinSameMonth_1() {
        // Given
        addHelper(2020, 2, 14, 3, 2020, 2, 17);
    }

    @Test (timeout = DEFAULT_TIMEOUT)
    public void addDays_wrapToNextMonth_2() {
        addHelper(2020, 2, 27, 3, 2020, 3, 1);
    }

    private void addHelper(int y, int m, int d, int add, int y2, int m2, int d2) {
        Date act = new Date(y, m, d);
        act.addDays(add);
        Date exp = new Date(y2, m2, d2);
        Assert.assertEquals("after " + add + " days", exp, act);
    }
}
