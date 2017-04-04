import Model.Team;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ttomaka on 04.04.2017.
 */
public class TeamTest {

    @Test
    public void testGetFilePath() {
        Team team = new Team();
        assertEquals(team.getFilePath(), "src/main/resources/football.dat");
    }
    @Test
    public void testGetLabelColumnIndex() {
        Team team = new Team();
        assertEquals(team.getLabelColumnIndex(), 2);
    }
    @Test
    public void testGetNum1ColIndex() {
        Team team = new Team();
        assertEquals(team.getNum1ColIndex(), 7);
    }
    @Test
    public void testGetNum2ColIndex() {
        Team team = new Team();
        assertEquals(team.getNum2ColIndex(), 9);
    }
}
