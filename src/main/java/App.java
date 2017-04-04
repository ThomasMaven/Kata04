import Model.Day;
import Model.Team;
import Repo.LineRepo;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Weather Start");
        String dayWithSmallestTempAmplitude = LineRepo.getLabelWithSmallestNumberDiff(Day.class);
        System.out.println("Day with smallest diff is " + dayWithSmallestTempAmplitude);

        System.out.println("Football Start");
        String teamWithSmallestGoalDifference = LineRepo.getLabelWithSmallestNumberDiff(Team.class);
        System.out.println("Team with smallest goal difference is " + teamWithSmallestGoalDifference);


    }
}
