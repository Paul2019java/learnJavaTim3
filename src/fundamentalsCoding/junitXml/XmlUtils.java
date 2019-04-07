package fundamentalsCoding.junitXml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

public class XmlUtils {

    //TODO 1
    // method that generates a tag string for a tag name and tag attributes
    // <book name="Tom Sayer" author="Mark Twain" />

    public static String xmlTag(
            String tagName,
            Map<String, String> attributes){

        return "xyz";
    }


    //TODO 2
    // method that generates a start tag string for a tag name and tag attributes
    // <book name="Tom Sayer" author="Mark Twain">
    //   text <new>  new text </new>

    //TODO 3
    // method that generates an ent tag string for a tag name
    // </book>


    @Test
    public void test_xmlTag(){

        String expectedXmlTag = "<book name=\"Tom Sayer\" author=\"Mark Twain\" />";

        String tagName = "book";

        Map<String, String> tagAttributes = Map.of(
                "name", "Tom Sayer",
                "author", "Mark Twain");

        String actualXmlTag = xmlTag(tagName, tagAttributes);

        Assertions.assertEquals(expectedXmlTag, actualXmlTag);
    }

}
