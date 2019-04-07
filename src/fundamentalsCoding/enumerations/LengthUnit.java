package fundamentalsCoding.enumerations;

public enum LengthUnit {

    METER(1),

    INCH(0.025f),

    CENTIMETER(0.01f),

    FOOT(0.3f),

    MM(0.001f),

    KM(1000);

    private float conversionFactor;

    LengthUnit(float conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public float toMeter(float length) {
        return length * conversionFactor;
    }

    /*    private float getConversionFactor() {

        switch (this){
            case KM: return 1000;
            case FOOT: return 0.3f;
            case INCH: return 0.025f;
            case CENTIMETER: return 0.01f;
            case METER: return 1;

            default: throw new Error("unknown length unit: "
                    + this.toString());
        }
    }*/
}
