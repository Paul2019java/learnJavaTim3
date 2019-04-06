package fundamentalsCoding.base;

import org.junit.jupiter.api.Disabled;
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

        TreeSet<Integer> orderedIds = new TreeSet();
        orderedIds.addAll(userById.keySet());
        System.out.println("Ordered keys: " + orderedIds);

        // remove duplicates from list and order names
        final List<String> names = List.of(
                "Tania", "Dan", "Maria", "Carmen",
                "Titus", "Marcel", "Tania", "Dan",
                "Maria", "Carmen", "Tania", "Dan",
                "Maria", "Carmen"
        );
        // names.add("Dan"); // throws java.lang.UnsupportedOperationException
        System.out.println("Names: " + names);

        List<String> newNames = new ArrayList<>();
        newNames.addAll(names);
        newNames.add("Dan");
        System.out.println("newNames: "+ newNames);

        // names = newNames; // compiler error due to 'final' keyword

        Set<String> uniqNamesUnordered = new HashSet<>();
        uniqNamesUnordered.addAll(names);

        Set<String> uniqNames = new TreeSet<>();
        uniqNames.addAll(names);

        System.out.println("Unique unordered names (HashSet): " + uniqNamesUnordered);
        System.out.println("Unique and ordered names (TreeSet): " + uniqNames);
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
                porscheModels     // value
        );

        List<String> audiModels = List.of("A4", "S8", "R8", "B3", "S8", "S8");
        carsByBrand.put(
                CarBrand.AUDI, // key
                audiModels     // value
        );

        List<String> fordModels = List.of("Fiesta", "Mondeo", "Focus", "Galaxy");
        List<String> fordModels2 = List.of("Fiesta", "Mondeo");
        carsByBrand.put(
                CarBrand.FORD, // key
                fordModels     // value
        );

        // overwrite CarBrand.FORD key
        carsByBrand.put(
                CarBrand.FORD, // key
                fordModels2    // value
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

    @Test
    @Disabled
    // thows a runtime exception - java.lang.UnsupportedOperationException
    public void testChangeUnmodifiableMap(){
        userById.put(100, "superuser");
        System.out.println(userById);
    }
}
