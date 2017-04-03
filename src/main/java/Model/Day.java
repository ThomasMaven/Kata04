package Model;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class Day {
    private int dayNumber;
    private int maxTemp;
    private int minTemp;

    public Day() {}

    public Day(int dayNumber, int maxTemp, int minTemp) {
        this.dayNumber = dayNumber;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }


    public int getDayNumber() {
        return dayNumber;
    }

    public int getTempDiff() {
        return maxTemp - minTemp;
    }

}
