package Repo;

import Model.IFileModel;
import Model.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created by ttomaka on 04.04.2017.
 */
public class LineRepo {

    private static int labelColumnNumber, number1ColumnNumber, number2ColumnNumber;
    private static String filePath;

    public static String getLabelWithSmallestNumberDiff(Class<? extends IFileModel> modelClass) {
        String labelToReturn = "";
        int minValue = -1;
        initModelVariables(modelClass);

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");

            while (scanner.hasNext()) {
                String[] values = scanner.next().split("\\s+");
                //check if we have all 3 column values
                if( values.length > maxIndex() && values[number1ColumnNumber].matches("\\d+")
                        && values[number2ColumnNumber].matches("\\d+")) {
                    Line currentLine = new Line(values[labelColumnNumber],
                            getIntValue(values[number1ColumnNumber]), getIntValue(values[number2ColumnNumber]));
                    if( labelToReturn.equals("") || minValue > currentLine.getNumbersDiff() ) {
                        labelToReturn = currentLine.getLabel();
                        minValue = currentLine.getNumbersDiff();
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return labelToReturn;
    }

    private static int maxIndex() {
        return Math.max(labelColumnNumber, Math.max(number1ColumnNumber, number2ColumnNumber));
    }

    private static void initModelVariables(Class<? extends IFileModel> modelClass) {
        try {
            Object object = modelClass.newInstance();
            labelColumnNumber = (int) modelClass.getMethod("getLabelColumnIndex").invoke(object);
            number1ColumnNumber = (int) modelClass.getMethod("getNum1ColIndex").invoke(object);
            number2ColumnNumber = (int) modelClass.getMethod("getNum2ColIndex").invoke(object);
            filePath = (String) modelClass.getMethod("getFilePath").invoke(object);
        } catch (IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    private static int getIntValue(String number) {
        //remove all non numeric characters
        return Integer.parseInt(number.replaceAll("[^\\d.]", ""));
    }
}
