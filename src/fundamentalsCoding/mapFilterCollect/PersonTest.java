package fundamentalsCoding.mapFilterCollect;

import java.util.ArrayList;
import java.util.List;

import static fundamentalsCoding.mapFilterCollect.Employer.*;

public class PersonTest {
    static List<Person> employees;


    public static void main(String[] args) {
    //public static void main(String... args) {

        initializePersonList();

        //printList(employees);

        List<Person> employeesFromVISMA = getEmployeesFromCompany(
                employees,
                VISMA);
        System.out.println("employees from VISMA: " + employeesFromVISMA.size());
        printList(employeesFromVISMA);


        System.out.println("employees from ATOS");
        printList(getEmployeesFromCompany(employees, ATOS));

        List<Person> employeesFromNokia = getEmployeesFromCompany(employees, NOKIA);
        System.out.println("employees from NOKIA: " + employeesFromNokia.size());
        printList(employeesFromNokia);

        int ageLimit = 30;
        Employer employer = ATOS;
        System.out.println("\nemployees from " + employer + " under " + ageLimit + " years: ");
        printList(getEmployeesFromCompanyWithAgeUnderLimit(
                employees,
                employer,
                ageLimit
        ));

        // get all persons' names from a list of person
        //List<Person>  ---> List<String> (names)
        List<String> names = getNames(employees);
        System.out.println("\nNames: " + names.toString());

        // get all names from ATOS from employees
        List<Person> atosEmployees = getEmployeesFromCompany(employees, ATOS);
        List<String> namesFromAtos = getNames(atosEmployees);
        System.out.println("namesFromAtos: " + namesFromAtos);

/*        System.out.println("namesFromAtos: "
                + getNames(
                        getEmployeesFromCompany(employees, ATOS)));*/

        // get average age for IT employees
        float averageAge = getAverageAge(employees);
        System.out.println("\nAverage age: " + averageAge);

        //get average age for employees at ATOS under 30 years
        List<Person>  empl = getEmployeesFromCompanyWithAgeUnderLimit(
                employees,
                ATOS,
                30
        );
        System.out.println("average age for employees at ATOS under 30 years: " + getAverageAge(empl));
    }


    private static void initializePersonList() {
        Person person1 = new Person("John Doe", 30, IBM);
        //System.out.println(person1);

        Person person2 = new Person("Jane Doe", 27, ATOS);
        //System.out.println(person2);

        employees = List.of(
                person1,
                person2,

                new Person("Dan", 25, VISMA),
                new Person("Ovidiu", 27, IBM),
                new Person("Carmen", 29, ATOS),
                new Person("Bill", 27, VISMA),
                new Person("Marcel", 34, ATOS),
                new Person("Marius", 27, IBM),
                new Person("Laura", 40, ATOS),
                new Person("Maria", 27, AZETS),
                new Person("George", 19, VISMA));
    }

    private static void printList(List<Person> persons){
        for(Person person : persons){
            System.out.println(person);
        }
    }

    // FILTER
    //List<Person>  ---> List<Person> - items count can change
    private static List<Person> getEmployeesFromCompany(
            List<Person> persons,
            Employer employer){

        List<Person> employeesFromCompany = new ArrayList<>();

        for(Person person : persons){
            if(person.getEmployer().equals(employer)) {
                employeesFromCompany.add(person);
            }
        }

        return employeesFromCompany;
    }

    private static List<Person> getEmployeesUnderLimit(List<Person> persons, int ageLimit) {
        List<Person> employeesUnderLimit = new ArrayList<>();
        for(Person person : persons){
            if(person.getAge() <= ageLimit){
                employeesUnderLimit.add(person);
            }
        }
        return employeesUnderLimit;
    }

    private static List<Person> getEmployeesFromCompanyWithAgeUnderLimit(
            List<Person> persons,
            Employer employer,
            int ageLimit){

        List<Person> employeesFromCompanyWithAgeUnderLimit = new ArrayList<>();

        List<Person> employeesFromCompany = getEmployeesFromCompany(persons, employer);

        return getEmployeesUnderLimit(employeesFromCompany, ageLimit);
    }

    // MAP
    private static List<String> getNames(List<Person> employees) {
        List<String> names = new ArrayList<>();

        for(Person person : employees){
            // add name in list
            names.add(person.getName());
        }

        return names;
    }

    // REDUCE / COLLECT
    private static float getAverageAge(List<Person> employees) {

        List<Integer> ages = getAges(employees);

        return (float)getAgesSum(ages) / employees.size();
    }

    private static int getAgesSum(List<Integer> ages) {
        int sum = 0;
        for(Integer age : ages) {
            sum += age;
        }
        return sum;
    }

    private static List<Integer> getAges(List<Person> employees) {
        List<Integer> ages = new ArrayList<>();
        for(Person person : employees) {
            ages.add(person.getAge());
        }
        return ages;
    }


}
