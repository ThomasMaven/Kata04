import Repo.DayRepo;
import Repo.TeamRepo;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Weather Start");
        int dayWithSmallestTempAmplitude = DayRepo.getDayWithSmallestTemperatureAmplitude("src/main/resources/weather.dat");
        System.out.println("Day with smallest diff is " + dayWithSmallestTempAmplitude);

        System.out.println("Football Start");
        String teamWithSmallestGoalDifference = TeamRepo.getTeamWithSmallestGoalDifference("src/main/resources/football.dat");
        System.out.println("Team with smallest goal difference is " + teamWithSmallestGoalDifference);


    }
}
