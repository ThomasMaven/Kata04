package Repo;

import Model.Day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class DayRepo {
    public static int getDayWithSmallestTemperatureAmplitude(String filePath) {
        int minDay = -1;
        int minValue = -1;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String[] values = scanner.next().split("\\s+");
                //check if we have all 3 column values
                if( values.length>3 && values[1].matches("\\d+")) {
                    Day currentDay = new Day(getIntValue(values[1]), getIntValue(values[2]), getIntValue(values[3]));
                    if( minDay == -1 || minValue > currentDay.getTempDiff() ) {
                        minDay = currentDay.getDayNumber();
                        minValue = currentDay.getTempDiff();
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return minDay;
    }

    private static int getIntValue(String number) {
        //remove all non numeric characters
        return Integer.parseInt(number.replaceAll("[^\\d.]", ""));
    }


}
