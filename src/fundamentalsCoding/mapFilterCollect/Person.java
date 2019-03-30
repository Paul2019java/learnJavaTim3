package fundamentalsCoding.mapFilterCollect;

import static java.lang.String.join;

public class Person {

    private String name;
    private int age;
    private Employer employer;

    public Person(
            String name,
            int age,
            Employer employer) {

        this.name = name;
        this.age = age;
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employer getEmployer() {
        return employer;
    }

    @Override
    public String toString() {
        return join(" | ",
                name,
                Integer.valueOf(age).toString(),
                // age + ""
                employer.toString());
    }
}
