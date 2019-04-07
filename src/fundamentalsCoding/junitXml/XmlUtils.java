package fundamentalsCoding.junitXml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class XmlUtils {

    //TODO 1
    // method that generates a tag string for a tag name and tag attributes
    // <book name="Tom Sayer" author="Mark Twain" />

    public static String xmlTag(
            String tagName,
            Map<String, String> attributes) {

        String xmlTagString = "<" + tagName;

        String attributesString = getAttributesString(attributes);

        xmlTagString += " " + attributesString;

        xmlTagString += "/>";

        return xmlTagString;
    }

    private static String getAttributesString(Map<String, String> attributes) {

        String attributesString = "";
        for (String attributeName : attributes.keySet()) {
            attributesString += attributeName
                    + "=" + "\"" + attributes.get(attributeName) + "\" ";
        }
        return attributesString;
    }


    //TODO 2
    // method that generates a start tag string for a tag name and tag attributes
    // <book name="Tom Sayer" author="Mark Twain">
    public static String xmlStartTag(
            String tagName,
            Map<String, String> attributes) {

        String xmlTagString = "<" + tagName;

        String attributesString = getAttributesString(attributes);

        xmlTagString += " " + attributesString.trim();

        xmlTagString += ">";

        return xmlTagString;
    }

    //TODO 3
    // method that generates an ent tag string for a tag name
    // </book>
    public static String xmlEndTag(
            String tagName){
        return "</" + tagName + ">";
    }

    @Test
    public void test_xmlTag() {

        // expected output
        String expectedXmlTag = "<book author=\"Mark Twain\" name=\"Tom Sayer\" />";

        // Input data
        String tagName = "book";

        Map<String, String> tagAttributes = Map.of(
                "name", "Tom Sayer",
                "author", "Mark Twain");

        Map<String, String> orderedTagAttributes = new TreeMap<>();
        orderedTagAttributes.putAll(tagAttributes);

        // execute method with input data, generates actual output
        String actualXmlTag = xmlTag(tagName, orderedTagAttributes);

        Assertions.assertEquals(expectedXmlTag, actualXmlTag);
    }

    @Test
    public void test_xmlStartTag() {

        // expected output
        String expectedXmlTag = "<book author=\"Mark Twain\" name=\"Tom Sayer\">";

        // Input data
        String tagName = "book";

        Map<String, String> tagAttributes = Map.of(
                "name", "Tom Sayer",
                "author", "Mark Twain");

        Map<String, String> orderedTagAttributes = new TreeMap<>();
        orderedTagAttributes.putAll(tagAttributes);

        // execute method with input data, generates actual output
        String actualXmlTag = xmlStartTag(tagName, orderedTagAttributes);

        Assertions.assertEquals(expectedXmlTag, actualXmlTag);
    }

    @Test
    public void test_getAttributesString() {

        String expectedXmlTag = "author=\"Mark Twain\" name=\"Tom Sayer\" ";

        Map<String, String> attributes = Map.of(
                "name", "Tom Sayer",
                "author", "Mark Twain");

        Map<String, String> orderedAttributes = new TreeMap<>();
        orderedAttributes.putAll(attributes);

        String actualAttributesString = getAttributesString(orderedAttributes);

        Assertions.assertEquals(expectedXmlTag, actualAttributesString);
    }

    @Test
    public void test_getEndTag(){
        String expectedXmlEndTag = "</book>";

        String actualEndTagString = xmlEndTag("book");

        Assertions.assertEquals(expectedXmlEndTag, actualEndTagString);
    }

}
