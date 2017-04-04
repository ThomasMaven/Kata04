import Model.Day;
import Model.Team;
import Repo.LineRepo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by ttomaka on 04.04.2017.
 */
public class MainTest {

    @Test
    public void testWeather() {
        String dayWithSmallestTempAmplitude = LineRepo.getLabelWithSmallestNumberDiff(Day.class);
        assertEquals(dayWithSmallestTempAmplitude, "14");
    }
    @Test
    public void testFootball() {
        String teamWithSmallestGoalDifference = LineRepo.getLabelWithSmallestNumberDiff(Team.class);
        assertEquals(teamWithSmallestGoalDifference, "Aston_Villa");
    }
}
