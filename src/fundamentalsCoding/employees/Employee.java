package fundamentalsCoding.employees;


public class Employee {

    private String name;
    private String city;
    private Employer employer;

    public Employee(String name, String city, Employer employer) {
        this.name = name;
        this.city = city;
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Employer getEmployer() {
        return employer;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", employer=" + employer +
                '}';
    }
}
