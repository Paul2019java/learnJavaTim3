package fundamentalsCoding.base;

import org.junit.jupiter.api.Test;

import java.util.Properties;

public class PropertiesTest {

    @Test
    public void printAllProperties(){

        Properties properties = System.getProperties();

        //System.out.println(properties.toString());
        properties.forEach(
                (name,value) -> System.out.println(name + " = " + value));

    }

    @Test
    public void printUserDirProperty() {
        System.out.println("local path: " +
                System.getProperty("user.dir"));
    }

    @Test
    public void printCustomProperty() {
        System.out.println("custom property: " +
                System.getProperty("customSDAProperty"));
    }

}
