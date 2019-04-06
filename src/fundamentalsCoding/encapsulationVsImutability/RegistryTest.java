package fundamentalsCoding.encapsulationVsImutability;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
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
        for(int i=0; names.size() > 0; i++) {
            names.remove(0);
        }
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
        Registry registry = new Registry(names); // reference is @123fac -> list of 3 names

        Name newName = new Name("ABC", "XYZ!!!!!!!!!");
        // GOOD! will throw UnsupportedOperationException
        /*names.remove(0);
        names.add(0, newName);*/

        names = new ArrayList<>();  // name <--- new object (new reference @000abc)
        names.add(new Name("Marius", "Petrescu"));

        registry.print();
    }

}
