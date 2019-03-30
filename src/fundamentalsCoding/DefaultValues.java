package fundamentalsCoding;

import fundamentalsCoding.bytecodeExample.Person;

public class DefaultValues {

    // primitives
    static int intNumber;
    static long longNumber;
    static float floatNumber;
    static double doubleNumber;

    static boolean booleanPrimitiveValue;

    // Objects
    static Boolean booleanObjectValue;
    static String text;
    static Object object;
    static int[] primitivesArray;
    static Person person;


    public static void main(String[] args) {
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("boolean: " + booleanPrimitiveValue);
        System.out.println("Boolean: " + booleanObjectValue);
        System.out.println("String: " + text);
        System.out.println("Object: " + object);
        System.out.println("Array of int: " + primitivesArray);
        System.out.println("Person: " + person);
    }

}
