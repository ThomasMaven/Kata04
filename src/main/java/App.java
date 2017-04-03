import Repo.DayRepo;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Application Start");
        int dayWithSmallestTempAmplitude = DayRepo.getDayWithSmallestTemperatureAmplitude("src/main/resources/weather.dat");
        System.out.println("Day with smallest diff is " + dayWithSmallestTempAmplitude);

    }
}
