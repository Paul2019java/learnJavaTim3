package fundamentalsCoding.base;

import org.junit.jupiter.api.Test;
import test_19_03_30.Car;

import java.util.*;

public class MapTest {

    // unmodifiable map
    Map<Integer, String> userById = Map.of(
            100, "admin",
            200, "guest",
            300, "programmer",
            400, "tester"
    );

    Map<CarBrand, List<String>> carsByBrand = new TreeMap<>();

    @Test
    public void printMap(){
        System.out.println("Map: " + userById);
    }

    @Test
    public void printMapKeys(){
        Set<Integer> keys = userById.keySet();
        System.out.println("Keys :" + keys);
    }

    @Test
    public void printMapValues(){
        Collection<String> values = userById.values();
        System.out.println("Values :" + values);
    }


    @Test
    public void addElementsInCarByBrand(){
       // map.put(key, value)
        List<String> porscheModels = List.of("911", "718", "Panamera", "Carrera");
        carsByBrand.put(
                CarBrand.PORSCHE, // key
                porscheModels // value
        );

        List<String> audiModels = List.of("A4", "S8", "R8", "B3");
        carsByBrand.put(
                CarBrand.AUDI, // key
                audiModels // value
        );

        List<String> fordModels = List.of("Fiesta", "Mondeo", "Focus", "Galaxy");
        carsByBrand.put(
                CarBrand.FORD, // key
                fordModels // value
        );


        System.out.println("carsByBrand map: " + carsByBrand);
        String carBrandValues = Arrays.toString(CarBrand.values());
        List<CarBrand> carBrandValuesList = Arrays.asList(CarBrand.values());

        System.out.println("All car brands (String): "
                + carBrandValuesList);

        System.out.println("All car brands (List):   "
                + carBrandValues);

        System.out.println("Car brands: " + carsByBrand.keySet());
        Collection<List<String>> carModelsCollection = carsByBrand.values();
        System.out.println("Car models collection: " + carModelsCollection);

        // Get all models List
        // Cars: [ A4, S8, ..., 911, 718, ...]
        List<String> allModels = new ArrayList<>();
        System.out.println("\nCar models:");
        for(List<String> carModelsList : carModelsCollection){
            //System.out.println(carModelsList);
            allModels.addAll(carModelsList);
        }
        System.out.println(allModels);

    }

}
