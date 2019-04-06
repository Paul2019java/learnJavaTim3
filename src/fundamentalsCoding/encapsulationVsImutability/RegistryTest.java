package fundamentalsCoding.encapsulationVsImutability;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RegistryTest {

    @Test
    public void testWithListConstructor(){

        List<Name> names = new ArrayList<>();

        Name johnDoe = new Name("John", "Doe");
        names.add(johnDoe);

        names.add(new Name("Bill", "Gates"));
        names.add(new Name("Barak", "Obama"));

        // encapsulated object; can you change it???
        Registry registry = new Registry(names);

        Name newName = new Name("ABC", "XYZ!!!!!!!!!");
        names.remove(0);
        names.add(0, newName);

        registry.print();
    }


    @Test
    public void testWithUnmodifiableList(){

        List<Name> names = List.of(
                new Name("John", "Doe"),
                new Name("Bill", "Gates"),
                new Name("Barak", "Obama"));

        // encapsulated object; can you change it???
        Registry registry = new Registry(names);

        Name newName = new Name("ABC", "XYZ!!!!!!!!!");
        names.remove(0);
        names.add(0, newName);

        registry.print();
    }

}
