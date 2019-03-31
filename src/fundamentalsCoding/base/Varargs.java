package fundamentalsCoding.base;

import org.junit.jupiter.api.Test;


public class Varargs {

    @Test
    public void test_array_vs_varargs() {

        Integer[] numbersArray = {0, 1, 2, 3, 10, 7};

        // ARRAY
        System.out.println("\n1. Array argument:");
        printNumbers(numbersArray);
        // printNumbers();  //- this does not work

        //VARARGS
        System.out.println("\n\n1.Varargs - array param:");
        printNumbersVarargs(numbersArray);

        System.out.println("\n\n2.Varargs - no params:");
        printNumbersVarargs();

        System.out.println("\n3.Varargs - multiple params:");
        printNumbersVarargs(0, 1, 2, 3);

    }


    public void printNumbers(Integer[] numbers){
        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }


    public void printNumbersVarargs(Integer... numbers){
        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

}
