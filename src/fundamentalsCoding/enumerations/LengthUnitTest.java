package fundamentalsCoding.enumerations;

import utils.FileUtils;

import static fundamentalsCoding.enumerations.LengthUnit.*;

public interface LengthUnitTest {

    public static void main(String[] args) {

        float kmLength = 3;
        float inchLength = 100;
        float footLength = 200;
        float cmLength = 270;

        convertAndPrint(kmLength, KM);

        convertAndPrint(inchLength, INCH);

        convertAndPrint(footLength, FOOT);

        convertAndPrint(cmLength, CENTIMETER);
    }

    static void convertAndPrint(float length, LengthUnit lengthUnit) {
        float kmLengthInMeters = toMeter(length, lengthUnit);
        System.out.println(length + " " + lengthUnit + " = " + kmLengthInMeters + " M");
    }
}
