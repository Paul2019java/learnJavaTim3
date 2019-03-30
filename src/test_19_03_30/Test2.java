package test_19_03_30;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        // 1
        List<Integer> fiveMultipliersList = get5Multipliers(0, 10);
        printList(fiveMultipliersList);

        // 2
        printList(get5Multipliers(1, 6));

    }

    private static List<Integer> get5Multipliers(
            int startValue,
            int multipliersCount) {

        List<Integer> numbersList = new ArrayList<>();

        for(int number = startValue; numbersList.size() < multipliersCount; number++){
            if (is5Multiplier(number)){
                numbersList.add(number);
            }
        }

        return numbersList;
    }

    private static boolean is5Multiplier(int number) {
        return number % 5 == 0;
    }

    private static void printList(List<Integer> numbersList) {
        System.out.println(numbersList.toString()
                .replace("[", "")
                .replace("]", ""));
    }

}
