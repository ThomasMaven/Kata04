package Repo;

import Model.Day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class DayRepo {
    public static List<Day> getDaysFromFile(String filePath) {
        List<Day> dayList = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String[] values = scanner.next().split("\\s+");
                //check if we have all 3 column values
                if( values.length>3 && values[1].matches("\\d+")) {
                    dayList.add( new Day( getIntValue(values[1]), getIntValue(values[2]), getIntValue(values[3]) ) );
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dayList;
    }

    private static int getIntValue(String number) {
        //remove all non numeric characters
        int value = Integer.parseInt(number.replaceAll("[^\\d.]", ""));
        return value;
    }
}
