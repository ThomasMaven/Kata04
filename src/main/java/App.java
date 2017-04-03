import Model.Day;
import Repo.DayRepo;

import java.util.List;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Application Start");
        List<Day> dayList = DayRepo.getDaysFromFile("src/main/resources/weather.dat");
        System.out.println("DayList set!");

    }
}
