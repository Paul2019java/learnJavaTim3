package fundamentalsCoding.junitXml;

import java.util.Arrays;

public enum JunitXmlTag {
    TEST_SUITES,
    TEST_SUITE,
    TEST_CASE,
    FAILURE;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(JunitXmlTag.values()));

        JunitXmlTag object = TEST_SUITE;

        System.out.println(FAILURE.getClass().getName());
        System.out.println(FAILURE.getClass().getSimpleName());

        System.out.println("implicit toString: " + TEST_CASE);
        System.out.println("name instance method: " + TEST_CASE.name());
        System.out.println("explicit toString: " + TEST_CASE.toString());

    }


    @Override
    public String toString() {
        return name().toLowerCase().replace("_", "");
    }
}
