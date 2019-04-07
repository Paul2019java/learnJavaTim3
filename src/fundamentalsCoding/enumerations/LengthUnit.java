package fundamentalsCoding.enumerations;

public enum LengthUnit {

    METER,

    INCH,

    CENTIMETER,

    FOOT,

    KM;


    public static float toMeter(
            float length,
            LengthUnit lengthUnit) {

        return length;
    }
}
