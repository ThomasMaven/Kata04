package Model;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class Team implements IFileModel {
    private final int labelColumnIndex = 2;
    private final int num1ColIndex = 7;
    private final int num2ColIndex = 9;


    private final String filePath = "src/main/resources/football.dat";

    @Override
    public int getLabelColumnIndex() {
        return labelColumnIndex;
    }

    @Override
    public int getNum1ColIndex() {
        return num1ColIndex;
    }

    @Override
    public int getNum2ColIndex() {
        return num2ColIndex;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }


}
