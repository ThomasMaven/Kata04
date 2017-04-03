package Model;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class Day {
    int dayNumber;
    int maxTemp;
    int minTemp;

    public int getDayNumber() {
        return dayNumber;
    }

    public Day() {}

    public Day(int dayNumber, int maxTemp, int minTemp) {
        this.dayNumber = dayNumber;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
}
