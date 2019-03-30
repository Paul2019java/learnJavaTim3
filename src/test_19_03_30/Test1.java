package test_19_03_30;

import java.util.List;

import static java.util.Arrays.asList;

public class Test1 {

    public static void main(String[] args) {

        //directInitilizedArrayTest();

        programaticalyInitializeArray();

        //primitivesArrayTest();

    }

    private static void programaticalyInitializeArray() {
        Integer[] numbers2 = new Integer[10];
        int initialValue = 10;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = initialValue;
            initialValue += 2;
        }


        System.out.println("numbers2: " + asList(numbers2));
    }

    private static void directInitilizedArrayTest() {
        Integer[] numbers1 = new Integer[]{

                10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        System.out.println("numbers1 length: " + numbers1.length);
        System.out.println(numbers1);


        List<Integer> integerList = asList(numbers1);
        System.out.println("numbers1: " + integerList);
    }

    private static void primitivesArrayTest() {

        // primitives uninitialized array
        int[] numbers3 = new int[10];
        System.out.println("\nnumbers3:");
        for (int number : numbers3) {
            System.out.print(number + " ");
        }
       /* for(int i=0; i<numbers3.length; i++){
            System.out.print(numbers3[i] + " ");
        }*/
    }
}
