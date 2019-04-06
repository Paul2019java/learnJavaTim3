package fundamentalsCoding.employees;


import org.junit.jupiter.api.Test;

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

    public static void main(String[] args){

        Employee employee = new Employee(
                "Oana",
                "Timisoara",
                Employer.IBM);

        System.out.println(employee);  // implicit call of employee.toString
        System.out.println(employee.toString()); // explicit call of toString
    }
}
