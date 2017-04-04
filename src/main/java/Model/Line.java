package Model;

import static java.lang.Math.abs;

/**
 * Created by ttomaka on 04.04.2017.
 */
public class Line {

    private final String label;
    private final int number1;
    private final int number2;

    public Line(String label, int number1, int number2) {
        this.label = label;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getLabel() {
        return label;
    }

    public int getNumbersDiff() {
        return abs( number1 - number2 );
    }

}
