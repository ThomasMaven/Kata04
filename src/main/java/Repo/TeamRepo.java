package Repo;

import Model.Day;
import Model.Team;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class TeamRepo {

    public static String getTeamWithSmallestGoalDifference(String filePath) {
        String TeamName = "";
        int minValue = -1;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                String[] values = scanner.next().split("\\s+");
                //check if we have all 3 column values
                if( values.length>3 && values[7].matches("\\d+") && values[9].matches("\\d+")) {
                    Team currentTeam = new Team(values[2], getIntValue(values[7]), getIntValue(values[9]));
                    if( TeamName.equals("") || minValue > currentTeam.getGoalDiff() ) {
                        TeamName = currentTeam.getTeamName();
                        minValue = currentTeam.getGoalDiff();
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return TeamName;
    }

    private static int getIntValue(String number) {
        //remove all non numeric characters
        return Integer.parseInt(number.replaceAll("[^\\d.]", ""));
    }
}
