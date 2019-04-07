package fundamentalsCoding.enumerations;

public enum LengthUnit {

    METER,

    INCH,

    CENTIMETER,

    FOOT,

    KM;

/*    - inch, conversionFactor=0.025
    - centimeter, conversionFactor=0.1
    - foot,  conversionFactor=0.3
    - km, conversionFactor=1000*/
    public float toMeter(float length) {

        return length * getConversionFactor();
    }

    private float getConversionFactor() {

        switch (this){
            case KM: return 1000;
            case FOOT: return 0.3f;
            case INCH: return 0.025f;
            case CENTIMETER: return 0.01f;
            case METER: return 1;

            default: throw new Error("unknown length unit: "
                    + this.toString());
        }
    }
}
