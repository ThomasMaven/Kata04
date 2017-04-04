import Model.Day;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ttomaka on 04.04.2017.
 */
public class DayTest {

    @Test
    public void testGetFilePath() {
        Day day = new Day();
        assertEquals(day.getFilePath(), "src/main/resources/weather.dat");
    }
    @Test
    public void testGetLabelColumnIndex() {
        Day day = new Day();
        assertEquals(day.getLabelColumnIndex(), 1);
    }
    @Test
    public void testGetNum1ColIndex() {
        Day day = new Day();
        assertEquals(day.getNum1ColIndex(), 2);
    }
    @Test
    public void testGetNum2ColIndex() {
        Day day = new Day();
        assertEquals(day.getNum2ColIndex(), 3);
    }
}
